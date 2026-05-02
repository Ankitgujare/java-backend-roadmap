package org.example.autowire;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {


    @Bean
    @Scope("prototype")
    student student(Laptop laptop){
        student s1=new student();
        s1.setAge(22);
        s1.setLaptop(laptop);
        s1.code();
        return  s1;
    }


    @Bean
    Laptop laptop(){
        return new Laptop();
    }


}
