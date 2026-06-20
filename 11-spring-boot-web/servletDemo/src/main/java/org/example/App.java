package org.example;


import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class App {
    public static void main(String[] args) throws LifecycleException {

        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);
        tomcat.getConnector();
        Context context = tomcat.addContext("", null);

        Tomcat.addServlet(context,
                "HellowServlet",
                new HellowServlet());

        context.addServletMappingDecoded("/hello",
                "HellowServlet");


            System.out.println("Before start");
            tomcat.start();
            System.out.println("After start");

        System.out.println("Server started on port 8080");

        tomcat.getServer().await();
    }
}
