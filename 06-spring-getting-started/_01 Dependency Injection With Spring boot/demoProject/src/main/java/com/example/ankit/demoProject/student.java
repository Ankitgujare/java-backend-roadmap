package com.example.ankit.demoProject;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.stereotype.Component;

@Component
public class student {
    void coding(){
        System.out.println("Coding...");
    }
}
