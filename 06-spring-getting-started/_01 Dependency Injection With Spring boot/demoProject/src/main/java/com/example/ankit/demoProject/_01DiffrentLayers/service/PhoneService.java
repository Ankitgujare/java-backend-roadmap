package com.example.ankit.demoProject._01DiffrentLayers.service;

import com.example.ankit.demoProject._01DiffrentLayers.model.phone;
import com.example.ankit.demoProject._01DiffrentLayers.reposatory.phoneReposatory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhoneService {

    @Autowired
    phoneReposatory phonereposatory;
    public void add(phone phone){
        phonereposatory.save(phone);
    }

    public boolean goodForGaming(){
        return true;
    }
}
