package org.example._09MappingRelationshipTheroy._02oneTomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.lang.reflect.Array;
import java.util.Arrays;

public class oneToMany {
    public static void main(String[] args) {


        phone p1=new phone();
        p1.setSerialNumber(3);
        p1.setBrand("Samsung");
        p1.setModel("s20");

        phone p2=new phone();
        p2.setSerialNumber(4);
        p2.setBrand("Nokia");
        p2.setModel("Lumia 820");


        person person=new person();
        person.setPersonId(11);
        person.setName("Aman");
        person.setGender("Male");
        person.setPhone(Arrays.asList(p1,p2));

        p1.setPerson(person);
        p2.setPerson(person);

        //Now Phone should aslo know about persion it belongs to
        SessionFactory sf= new Configuration()
                .addAnnotatedClass(org.example._09MappingRelationshipTheroy._02oneTomany.person.class)
                .addAnnotatedClass(org.example._09MappingRelationshipTheroy._02oneTomany.phone.class)
                .configure()
                .buildSessionFactory();


        Session session=sf.openSession();
        session.persist(p1);
        session.persist(p2);
        session.persist(person);
        Transaction tf=session.beginTransaction();

        System.out.println("Data inserted Successfuly..");
        tf.commit();
        session.close();
        sf.close();
    }
}
