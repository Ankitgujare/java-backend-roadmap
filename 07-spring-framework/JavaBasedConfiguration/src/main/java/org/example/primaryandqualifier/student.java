package org.example.primaryandqualifier;

public class student {
   private int age;
   Computer computer;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    void coding(){
        computer.code();
    }
}

