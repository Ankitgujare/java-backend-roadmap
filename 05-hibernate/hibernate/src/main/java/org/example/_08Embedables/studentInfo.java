package org.example._08Embedables;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class studentInfo {
    String name;
    String gender;
    @Id
    int rollnumber;
    Laptop laptop;


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + rollnumber +
                ", laptop=" + laptop +
                '}';
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

    public Laptop getLaptop() {
        return laptop;
    }


    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public int getAge() {
        return rollnumber;
    }

    public void setAge(int age) {
        this.rollnumber = age;
    }


}
