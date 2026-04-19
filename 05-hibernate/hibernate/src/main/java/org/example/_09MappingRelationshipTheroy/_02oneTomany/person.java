package org.example._09MappingRelationshipTheroy._02oneTomany;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.util.List;

@Entity
public class person {
    @Id
    int pid;
    String name;
    int age;
    @OneToMany
    List<phone>phones;

    @Override
    public String toString() {
        return "person{" +
                "pid=" + pid +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phone=" + phones +
                '}';
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<phone> getPhones() {
        return phones;
    }

    public void setPhones(List<phone> phones) {
        this.phones = phones;
    }
}
