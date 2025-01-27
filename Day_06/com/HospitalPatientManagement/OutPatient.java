package com.HospitalPatientManagement;

//OutPatient class
class OutPatient extends Patient implements MedicalRecord {
    private static final double consultFee = 500;
    private static final double medicationFee = 1000;
    private String medicalHistory;

    //constructor
    public OutPatient(int patientId, String name, int age) {
        super(patientId, name, age);
        this.medicalHistory = "";
    }
    //generate bill
    @Override
    public double calculateBill() {
        return consultFee + medicationFee;
    }
    //add and view records
    @Override
    public void addRecord(String record) {
        medicalHistory += record + "\n";
    }

    @Override
    public String viewRecords() {
        return "Medical History:\n" + medicalHistory;
    }
}