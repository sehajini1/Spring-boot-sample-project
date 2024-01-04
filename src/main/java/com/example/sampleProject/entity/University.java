package com.example.sampleProject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class University {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String universityName;
    private String universityCity;

    public University() {

    }

    public University (int id, String universityName, String universityCity){
        this.id = id;
        this.universityName = universityName;
        this.universityCity = universityCity;
    }

     public int GetID() {
        return this.id;
     }
     public void SetID(int id) {
        this.id = id;
     }

    public String GetUniversityName() {
        return this.universityName;
    }
    public void SetUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String GetUniversityCity() {
        return this.universityCity;
    }
    public void SetUniversityCity(String universityCity) {
        this.universityCity = universityCity;
    }
}
