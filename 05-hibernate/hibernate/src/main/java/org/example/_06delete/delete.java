package org.example._06delete;

import org.example._03SuccesfullAttempToSaveData.student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class delete {
    public static  void main(String[] args) {

        //1 fetch the Object which we wanted to delete
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
        session.remove(s1);
        transaction.commit();
        System.out.println("Deleted...");
        session.close();
        sf.close();
    }
}
