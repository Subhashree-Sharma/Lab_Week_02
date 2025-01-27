package com.HospitalPatientManagement;
//abstract class Patient
public abstract class Patient {
    //data members
    private int patientId;
    private String name;
    private int age;

    //constructor
    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    //using getters
    public int getPatientId() {
        return patientId;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    //abstract method
    public abstract double calculateBill();

    //concrete method
    public String getPatientDetails() {
        return "Patient ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }
}
