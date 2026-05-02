package org.example.stereotypeannotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("desktop")
public class Desktop implements Computer {
    @Override
    public void code() {
        System.out.println("Coding In Desktop..");
    }
}
