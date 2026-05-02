package org.example.stereotypeannotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements Computer {

    @Override
    public void code() {
        System.out.println("Coding In Laptop..");
    }
}
