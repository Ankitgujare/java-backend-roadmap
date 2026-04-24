package org.example._09MappingRelationshipTheroy._10EagerandLazyFetch;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
import java.util.List;

public class EagerandLazyFetch {
    public static void main(String[] args) {


        Car c1=new Car();
        c1.setBrand("Tata");
        c1.setModel("Nexon");
        c1.setCid(1);

        Car c2=new Car();
        c2.setBrand("Tata");
        c2.setModel("Nano");
        c2.setCid(2);



        Driver driver=new Driver();
        driver.setName("John");
        driver.setAge(22);
        driver.setId(101);
        driver.setCars(Arrays.asList(c1,c2));

        Driver driver1=new Driver();
        driver.setName("alex");
        driver.setAge(25);
        driver.setId(102);
        driver.setCars(List.of(c1));


        SessionFactory sf= new Configuration()
                .addAnnotatedClass(org.example._09MappingRelationshipTheroy._10EagerandLazyFetch.Driver.class)
                .addAnnotatedClass(org.example._09MappingRelationshipTheroy._10EagerandLazyFetch.Car.class)
                .configure()
                .buildSessionFactory();


        Session session=sf.openSession();
        Transaction transaction=session.beginTransaction();
        session.persist(driver);
        session.persist(driver1);
        session.persist(c1);
        session.persist(c2);

        transaction.commit();
        //get the Data
       Driver data= session.find(Driver.class,101);
       //so here we are not Printing it
      //  System.out.println(data);


        session.close();
        sf.close();
    }
}
