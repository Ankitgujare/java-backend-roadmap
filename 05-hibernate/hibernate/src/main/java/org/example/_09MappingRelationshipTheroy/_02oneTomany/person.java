package org.example._09MappingRelationshipTheroy._02oneTomany;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.util.List;

@Entity
public class person {
    @Id
   private int personId;
   private String name;
   private String gender;
   @OneToMany(mappedBy = "person")
   private List<phone> phone;

    public List<phone> getPhone() {
        return phone;
    }

    public void setPhone(List<phone> phone) {
        this.phone = phone;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
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
}
