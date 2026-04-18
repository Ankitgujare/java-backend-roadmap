package org.example._08Embedables;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employees {
    String name;
    String gender;
    @Id
    int EmployeeId;
    Laptop laptop;

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", EmployeeId=" + EmployeeId +
                ", laptop=" + laptop +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(int employeeId) {
        EmployeeId = employeeId;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
}
