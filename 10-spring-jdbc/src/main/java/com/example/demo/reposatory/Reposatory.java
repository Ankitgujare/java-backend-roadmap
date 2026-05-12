package com.example.demo.reposatory;

import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class Reposatory {

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    JdbcTemplate jdbcTemplate;
    public void save(Student s1) {
        String query="insert into studentinfo (name,roll,gender) values (?,?,?)";
       int rows= jdbcTemplate.update(query,s1.getName(),s1.getRoll(),s1.getGender());
        System.out.println(rows+" Affected");

    }

    public List<Student>findAll() {
        String query="select * from studentinfo";

        RowMapper<Student> mapper=new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {

                Student s1=new Student();
                s1.setRoll(rs.getInt("roll"));
                s1.setName(rs.getString("name"));
                s1.setGender(rs.getString("gender"));
                return  s1;
            }
        };

        return jdbcTemplate.query(query,mapper);
    }
    }

