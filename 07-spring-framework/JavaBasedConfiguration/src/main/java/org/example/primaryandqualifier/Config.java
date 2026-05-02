package org.example.primaryandqualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {


    @Bean
    @Scope("prototype")
    student student(Computer computer){ //@Qualifier("laptop") Computer computer Or
        student s1=new student();
        s1.setAge(22);
        s1.setComputer(computer);
        s1.coding();
        return  s1;
    }


    @Bean
    Laptop laptop(){ //You can make bean as a Primary
        return new Laptop();
    }

    @Bean
    @Primary
    Desktop desktop(){
        return new Desktop();
    }


    //Either You can use Qualifier Or use Primary to Give more Priority to the Bean


}
