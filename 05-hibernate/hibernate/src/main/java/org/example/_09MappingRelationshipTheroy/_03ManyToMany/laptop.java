package org.example._09MappingRelationshipTheroy._03ManyToMany;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import java.util.List;

@Entity
public class laptop {
    @Id
    private int LaptopId;
    private String brand;
    private String model;

    @Override
    public String toString() {
        return "laptop{" +
                "LaptopId=" + LaptopId +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", students=" + students +
                '}';
    }

    @ManyToMany(mappedBy = "laptops")
    private List<student>students;

    public int getLaptopId() {
        return LaptopId;
    }

    public void setLaptopId(int laptopId) {
        LaptopId = laptopId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<student> getStudents() {
        return students;
    }

    public void setStudents(List<student> students) {
        this.students = students;
    }
}
