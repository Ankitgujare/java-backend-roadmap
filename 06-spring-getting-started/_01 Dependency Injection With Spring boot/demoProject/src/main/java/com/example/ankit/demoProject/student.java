package com.example.ankit.demoProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.stereotype.Component;

@Component
public class student {
    @Autowired
    Laptop laptop;

    void coding(){
        laptop.coding();
    }
}
