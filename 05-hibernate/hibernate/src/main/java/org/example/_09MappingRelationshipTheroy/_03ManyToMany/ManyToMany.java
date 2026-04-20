package org.example._09MappingRelationshipTheroy._03ManyToMany;

import org.example._08Embedables.Laptop;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ManyToMany {
    public static void main(String[] args) {


        laptop l1=new laptop();
        l1.setLaptopId(1);
        l1.setBrand("hp");
        l1.setModel("Pavelion");

        laptop l2 = new laptop();
        l2.setLaptopId(2);
        l2.setBrand("Dell");
        l2.setModel("Inspiron 15");

        laptop l3 = new laptop();
        l3.setLaptopId(3);
        l3.setBrand("Lenovo");
        l3.setModel("ThinkPad E14");



        student s1=new student();
        s1.setRollNumber(101);
        s1.setName("Aman");
        s1.setBranch("CSE");


        student s2 = new student();
        s2.setRollNumber(102);
        s2.setName("Rohit");
        s2.setBranch("IT");

        student s3 = new student();
        s3.setRollNumber(103);
        s3.setName("Sneha");
        s3.setBranch("ECE");



        s1.setLaptops(Arrays.asList(l1,l2));
        s2.setLaptops(Arrays.asList(l2,l3));
        s3.setLaptops(List.of(l3));


        l1.setStudents(Arrays.asList(s1,s2));
        l2.setStudents(Arrays.asList(s2,s3));
        l2.setStudents(Arrays.asList(s3));

        SessionFactory sf=new Configuration()
                .addAnnotatedClass(org.example._09MappingRelationshipTheroy._03ManyToMany.student.class)
                .addAnnotatedClass(org.example._09MappingRelationshipTheroy._03ManyToMany.laptop.class)
                .configure()
                .buildSessionFactory();

        Session session=sf.openSession();
        session.persist(s1);
        session.persist(s2);
        session.persist(s3);
        session.persist(l1);
        session.persist(l2);
        session.persist(l3);
        Transaction transaction=session.beginTransaction();
        transaction.commit();
        System.out.println("Data is Inserted");
        session.close();
        sf.close();


    }
}
