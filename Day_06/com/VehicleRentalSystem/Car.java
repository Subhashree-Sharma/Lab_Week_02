package com.VehicleRentalSystem;
//subclass Car
public class Car extends Vehicle implements Insurable{
    //constructor
    Car(int vehicleNumber, String type, double rentalRate){
        super(vehicleNumber, type, rentalRate);
    }

    //calculate rent, insurance and get details
    public double calculateRentalCost(int days){
        return days * getRentalRate();
    }

    public double calculateInsurance(int tax){
        return getRentalRate() * tax;
    }
    public double getInsuranceDetails(int policyNumber){
        return policyNumber;
    }
}
