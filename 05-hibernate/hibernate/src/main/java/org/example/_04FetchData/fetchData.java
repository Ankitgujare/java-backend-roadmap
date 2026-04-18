package org.example._04FetchData;

import org.example._03SuccesfullAttempToSaveData.student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class fetchData {
    public static void main(String[] args) {

        student s1;
         SessionFactory sf=new Configuration()
                 .addAnnotatedClass(org.example._03SuccesfullAttempToSaveData.student.class)
                 .configure()
                 .buildSessionFactory();

        Session session=sf.openSession();
        //getting the data is not transaction so we dont need trasaction Object
        s1=session.find(student.class,104);
        session.close();
        sf.close();

        System.out.println(s1);

        System.out.println("RollNumber "+s1.getRollNumber());
        System.out.println("Name "+s1.getName());
        System.out.println("Branch "+s1.getBranch());


        //so hibernate automaticaly for us convert the sqlData into an Object
        //so we dont need to convert data froms sql Query to the Object and wise versa


    }
}
