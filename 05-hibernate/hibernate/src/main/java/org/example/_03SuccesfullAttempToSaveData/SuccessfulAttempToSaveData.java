package org.example._03SuccesfullAttempToSaveData;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SuccessfulAttempToSaveData {
    public static void main(String[] args) {

        student s1=new student();
        s1.setName("Lucky");
        s1.setRollNumber(105);
        s1.setBranch("CSE");


        Configuration configuration=new Configuration();
        configuration.addAnnotatedClass(student.class);
        configuration.configure();


        SessionFactory sf=configuration.buildSessionFactory();
        Session session=sf.openSession();
        Transaction transaction=session.beginTransaction();
        session.persist(s1);
        transaction.commit();
        session.close();






    }
}
