package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class student {
    private String name,branch;
    @Id
    private int rollNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                ", rollNumber=" + rollNumber +
                '}';
    }
}
