package com.VehicleRentalSystem;
//subclass bike
public class Bike extends Vehicle implements Insurable{
    //constructor
    Bike(int vehicleNumber, String type, double rentalRate){
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
