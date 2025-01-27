package com.HospitalPatientManagement;

// Main class
public class HospitalPatientManagement{
    public static void main(String[] args) {
        //patient objects
        Patient inPatient = new InPatient(1, "Leena",30, 5);
        Patient outPatient = new OutPatient(2, "Riya", 25);

        //process InPatient
        System.out.println(inPatient.getPatientDetails());
        System.out.println("Bill Amount- " + inPatient.calculateBill());
        MedicalRecord inPatientRecord = (MedicalRecord) inPatient;
        inPatientRecord.addRecord("Diagnosed with appendicitis.");
        inPatientRecord.addRecord("Surgery performed successfully.");
        System.out.println(inPatientRecord.viewRecords());

        System.out.println();
        //Process OutPatient
        System.out.println(outPatient.getPatientDetails());
        System.out.println("Bill Amount- " + outPatient.calculateBill());
        MedicalRecord outPatientRecord = (MedicalRecord) outPatient;
        outPatientRecord.addRecord("Diagnosed with flu.");
        System.out.println(outPatientRecord.viewRecords());
    }
}