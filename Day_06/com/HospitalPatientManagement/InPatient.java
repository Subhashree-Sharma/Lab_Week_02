package com.HospitalPatientManagement;

//subclass InPatient class
class InPatient extends Patient implements MedicalRecord {
    private static final double roomPerDayCharge = 1000;
    private static final double treatmentCharge = 5000;
    private int numberOfDays;
    private String medicalHistory;

    //constructor
    public InPatient(int patientId, String name, int age, int numberOfDays) {
        super(patientId, name, age);
        this.numberOfDays = numberOfDays;
        this.medicalHistory = "";
    }
    //calculate bill
    @Override
    public double calculateBill() {
        return (numberOfDays * roomPerDayCharge) + treatmentCharge;
    }
    //add record
    @Override
    public void addRecord(String record) {
        medicalHistory += record + "\n";
    }
    //view record
    @Override
    public String viewRecords() {
        return "Medical History:\n" + medicalHistory;
    }
}