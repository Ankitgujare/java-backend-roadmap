package com.example.ankit.demoProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.stereotype.Component;

@Component
public class student {


    @Value("21")
    private int age;
    Computer computer;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComputer() {
        return computer;
    }

    @Autowired
   // @Qualifier("laptop")
    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public void coding(){
        computer.coding();
    }
}
