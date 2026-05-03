package com.example.ankit.demoProject;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements Computer{

    @Override
    public void coding() {
        System.out.println("Coding Using Desktop..");
    }
}
