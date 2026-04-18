package org.example._05UpdateTableNameandColNames;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class updateTableandColName {
    public static void main(String[] args) {

        Employee s1=new Employee();
        s1.setName("Alex");
        s1.setDesignation("HR");
        s1.setGender("Male");

        SessionFactory sf=new Configuration()
                .addAnnotatedClass(org.example._05UpdateTableNameandColNames.Employee.class)
                .configure()
                .buildSessionFactory();

        Session session=sf.openSession();
        Transaction transaction=session.beginTransaction();

        session.persist(s1);
        transaction.commit();
        System.out.println("Data Inserted Succesfully");
        session.close();
        sf.close();


    }
}
