package org.example._09MappingRelationshipTheroy._03ManyToMany;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class student {
    @Id
    private int rollNumber;
    private String name;
    private String branch;
    @ManyToMany
    private List<laptop>laptops;

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

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

    public List<laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<laptop> laptops) {
        this.laptops = laptops;
    }
}
