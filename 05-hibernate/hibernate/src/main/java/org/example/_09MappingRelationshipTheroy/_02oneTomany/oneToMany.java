package org.example._09MappingRelationshipTheroy._02oneTomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.lang.reflect.Array;
import java.util.Arrays;

public class oneToMany {
    public static void main(String[] args) {

        //Now in this case One student will have Multiple Phones
        //means List of Phones
        //create a Phone Object

        phone phone1=new phone();
        phone1.setPhoneId(59);
        phone1.setBrand("Samsung");
        phone1.setModel("A12");

        phone phone2=new phone();
        phone2.setPhoneId(60);
        phone2.setBrand("oPPO");
        phone2.setModel("X1");


        person person=new person();
        person.setName("John");
        person.setAge(35);
        person.setPid(1111);
        phone1.setPerson(person);
        phone2.setPerson(person);
        person.setPhones(Arrays.asList(phone1,phone2));



        //Now Phone should aslo know about persion it belongs to
        SessionFactory sf= new Configuration()
                .addAnnotatedClass(org.example._09MappingRelationshipTheroy._02oneTomany.person.class)
                .addAnnotatedClass(org.example._09MappingRelationshipTheroy._02oneTomany.phone.class)
                .configure()
                .buildSessionFactory();


        Session session=sf.openSession();
        Transaction tf=session.beginTransaction();
        session.persist(person);
        session.persist(phone1);
        session.persist(phone2);
        System.out.println("Data inserted Successfuly..");
        tf.commit();
        session.close();
        sf.close();
    }
}
