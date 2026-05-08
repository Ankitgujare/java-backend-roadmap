package com.example.springJDBCExample.service;

import com.example.springJDBCExample.model.student;
import com.example.springJDBCExample.reposatory.Reposatory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    public Reposatory getReposatory() {
        return reposatory;
    }

    Reposatory reposatory;

    @Autowired
    public void setReposatory(Reposatory reposatory) {
        this.reposatory = reposatory;
    }

    public void addstudent(student s1) {
        reposatory.add(s1);
    }

    public List<student> getstudents(){
        return reposatory.findAll();
    }


}
