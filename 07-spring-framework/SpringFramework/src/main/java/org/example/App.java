package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {

        //xml based config
        // it creates A container for us
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");


        Student s1= (Student) context.getBean("student");
        s1.coding();

        Student s2=(Student) context.getBean("student");
        s2.coding();

        System.out.println(s1==s2);

        //it will work but we are using Spring right
        //it should create an object for us..But we are doing it Currently
        //Do to get the Object with SpringFramework

        //and we need to create that Ioc Container

    }
}
