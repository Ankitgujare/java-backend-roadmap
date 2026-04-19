package org.example._09MappingRelationshipTheroy._02oneTomany;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class phone {
    @Id
    int phoneId;
    String brand;
    String model;

    @ManyToOne
    person person;

    public org.example._09MappingRelationshipTheroy._02oneTomany.person getPerson() {
        return person;
    }

    public void setPerson(org.example._09MappingRelationshipTheroy._02oneTomany.person person) {
        this.person = person;
    }

    public int getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(int phoneId) {
        this.phoneId = phoneId;
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
}
