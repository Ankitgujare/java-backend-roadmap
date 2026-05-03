package com.example.ankit.demoProject;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    public void coding(){
        System.out.println("Coding Using Laptop");
    }
}
