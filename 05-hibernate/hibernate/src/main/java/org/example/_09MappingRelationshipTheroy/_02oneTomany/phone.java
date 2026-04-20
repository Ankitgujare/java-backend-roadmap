package org.example._09MappingRelationshipTheroy._02oneTomany;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class phone {

    @Override
    public String toString() {
        return "phone{" +
                "serialNumber=" + serialNumber +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", person=" + person +
                '}';
    }

    @Id
    private int serialNumber;
    private String brand;
    private String model;

    @ManyToOne
    private person person;

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
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

    public org.example._09MappingRelationshipTheroy._02oneTomany.person getPerson() {
        return person;
    }

    public void setPerson(org.example._09MappingRelationshipTheroy._02oneTomany.person person) {
        this.person = person;
    }
}
