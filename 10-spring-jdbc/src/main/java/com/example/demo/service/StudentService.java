package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.reposatory.Reposatory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    public Reposatory getReposatory() {
        return reposatory;
    }

    @Autowired
    public void setReposatory(Reposatory reposatory) {
        this.reposatory = reposatory;
    }


    Reposatory reposatory;

    public void addStudent(Student s1) {
        reposatory.save(s1);
    }


    public List<Student>getAllData(){
        return reposatory.findAll();
    }
}