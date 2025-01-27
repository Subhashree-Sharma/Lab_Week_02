package com.VehicleRentalSystem;

//superclass vehicle
public abstract class Vehicle {

    //data members
    private int vehicleNumber;
    private String type;
    private double rentalRate;

    //constructor
    Vehicle(int vehicleNumber, String type, double rentalRate){
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    //using getter and setter methods
    public int getVehicleNumber(){
        return vehicleNumber;
    }
    public void setVehicleNumber(int vehicleNumber){
        this.vehicleNumber = vehicleNumber;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    //abstract method
    public abstract double calculateRentalCost(int days);

    //display details of vehicles
    public String toString() {
        return "Vehicle Number: " + vehicleNumber + ", Type: " + type + ", Rental Rate: " + rentalRate;
    }
}
