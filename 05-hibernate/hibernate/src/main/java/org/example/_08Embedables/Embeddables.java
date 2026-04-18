package org.example._08Embedables;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Embeddables {
    public static void main(String[] args) {

        Laptop l1=new Laptop();
        l1.setRam(12);
        l1.setBrand("HP");
        l1.setModel("Pavelion");


        studentInfo s1=new studentInfo();
        s1.setName("Aman");
        s1.setGender("Male");
        s1.setAge(110);
        s1.setLaptop(l1);

        SessionFactory sf= new Configuration()
                .addAnnotatedClass(org.example._08Embedables.studentInfo.class)
                .configure()
                .buildSessionFactory();

        Session session=sf.openSession();

        Transaction tf=session.beginTransaction();

        session.persist(s1);
        tf.commit();
        session.close();
        sf.close();
    }
}
