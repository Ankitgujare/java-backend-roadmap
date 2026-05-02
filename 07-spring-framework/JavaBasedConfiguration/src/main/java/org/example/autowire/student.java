package org.example.autowire;

public class student {
   private int age;
   private Laptop laptop;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    void code(){
        laptop.coding();
    }
}

