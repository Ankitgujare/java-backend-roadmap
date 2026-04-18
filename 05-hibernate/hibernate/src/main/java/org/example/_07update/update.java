package org.example._07update;

import org.example._03SuccesfullAttempToSaveData.student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class update {
    public static void main(String[] args) {

        //update
        //first create an Object which you want to update
        //by keeping the same what you want
        //and change the new one


        student s1=new student();
        s1.setName("Akash");
        s1.setBranch("BCA");
        s1.setRollNumber(101);


        SessionFactory sf=new Configuration()
                .addAnnotatedClass(org.example._03SuccesfullAttempToSaveData.student.class)
                .configure()
                .buildSessionFactory();


        Session session=sf.openSession();
        Transaction transaction=session.beginTransaction();
        session.merge(s1);
        transaction.commit();
        System.out.println("Entry is Updated");
        session.close();
        sf.close();
    }
}
