package com.example.ankit.demoProject._01DiffrentLayers;

import com.example.ankit.demoProject.DemoProjectApplication;
import com.example.ankit.demoProject._01DiffrentLayers.model.phone;
import com.example.ankit.demoProject._01DiffrentLayers.service.PhoneService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
      ApplicationContext context= SpringApplication.run(DemoProjectApplication.class, args);


        phone phone=context.getBean(phone.class);
        //we want to check wheater this Laptop is good for gaming or Programing
        //means want to do some Kind of Processing
        //For that we will create a Service class

        PhoneService phoneService=context.getBean(PhoneService.class);
        phoneService.add(phone);
        phoneService.goodForGaming();

       // So when we want to add this Phone to the DB
        // where we will add all those Database steps
        //we write those in the Reposatory Layer so lets do that
    }
}
