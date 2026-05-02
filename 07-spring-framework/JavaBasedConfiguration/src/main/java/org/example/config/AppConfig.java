package org.example.config;

import org.example.Car;
import org.example.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    Student student(){
        return new Student();
    }

    @Bean(name = "myCar")
    Car car(){
        return new Car();
    }

}
