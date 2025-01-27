package com.RideHailingApplication;

//abstract class Vehicle
public abstract class Vehicle {
    //data members
    private int vehicleId;
    private String driverName;
    private double ratePerKm;

    //constructor
    public Vehicle(int vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    //using getters
    public int getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    //abstract method
    public abstract double calculateFare(double distance);

    //concrete method
    public String getVehicleDetails() {
        return "Vehicle ID: " + vehicleId + ", Driver: " + driverName + ", Rate: " + ratePerKm + " per km";
    }
}