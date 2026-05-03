package com.example.ankit.demoProject._01DiffrentLayers.reposatory;

import com.example.ankit.demoProject._01DiffrentLayers.model.phone;
import org.springframework.stereotype.Repository;

@Repository
public class phoneReposatory {

    public void save(phone phone){
        System.out.println("Saving Phone to the DB..");
    }
}


//here we will add all the Database code to save the Data to DB