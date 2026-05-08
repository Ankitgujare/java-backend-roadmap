package com.example.springJDBCExample.reposatory;

import com.example.springJDBCExample.model.student;
import jdk.jfr.Enabled;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class Reposatory {


    public void add(student s1) {
        System.out.println("Student Data added");
    }


    public List<student> findAll() {
        return new ArrayList<>();
    }
}
