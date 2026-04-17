package org.example._02FailedAttempToStoreData;

import org.example.student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FailedAttemp {
    public static void main(String[] args) {
        //create an Object which we wanted to store in DB
        student s1=new student();
        s1.setName("Aman");
        s1.setRollNumber(101);
        s1.setBranch("ME");


        //1st we need configuaration
        //* here we will do configuration Like jdbc conn our username password and DB name
        Configuration configuration=new Configuration();

        //2 from config we will get sessionFactory
        //* its HeavyWeight Object so it will be Once for an Application
        SessionFactory sf=configuration.buildSessionFactory();

        //3 from sf we will get
        //* Every unit of work in DB we will have new Session
        Session session=sf.openSession();

        //4 now as we got session we have persist method to save an Object
        session.persist(s1);




    }
}
