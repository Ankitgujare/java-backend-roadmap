package org.example._09MappingRelationshipTheroy._01OneToOne;


import org.example._09MappingRelationshipTheroy._02oneTomany.person;
import org.example._09MappingRelationshipTheroy._02oneTomany.phone;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OnetoOne {
    public static void main(String[] args) {


        phone p1=new phone();
//        /p1.setPhoneId(2);
        p1.setBrand("Samsung Galaxy");
        p1.setModel("s20");


        person person=new person();
        person.setName("Aniket");
//        person.setPhone(p1);
//        person.setPid(101);
//        person.setAge(24);




        SessionFactory sf= new Configuration()
                .addAnnotatedClass(org.example._09MappingRelationshipTheroy._02oneTomany.person.class)
                .addAnnotatedClass(phone.class)
                .configure()
                .buildSessionFactory();


        Session session=sf.openSession();
        Transaction tf=session.beginTransaction();
        session.persist(p1);
        session.persist(person);
        System.out.println("Data inserted Successfuly..");
        tf.commit();
        session.close();
        sf.close();




    }
}
