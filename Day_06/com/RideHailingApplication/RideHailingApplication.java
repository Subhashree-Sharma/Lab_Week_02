package com.RideHailingApplication;

//main class
public class RideHailingApplication {
    public static void main(String[] args) {

        //objects of vehicle
        Vehicle car = new Car(101, "Mohan", 15.0, "City Center");
        Vehicle bike = new Bike(102, "Riya", 8.0, "Airport");
        Vehicle auto = new Auto(103, "Kapil", 10.0, "Bus Stand");

        //calculate fares dynamically
        System.out.println(car.getVehicleDetails());
        System.out.println("Fare for 12 km- " + car.calculateFare(12));
        System.out.println("Current Location: " + ((GPS) car).getCurrentLocation());
        ((GPS) car).updateLocation("Mall");
        System.out.println("Updated Location- " + ((GPS) car).getCurrentLocation());

        System.out.println();

        System.out.println(bike.getVehicleDetails());
        System.out.println("Fare for 8 km- " + bike.calculateFare(8));
        System.out.println("Current Location- " + ((GPS) bike).getCurrentLocation());
        ((GPS) bike).updateLocation("Railway Station");
        System.out.println("Updated Location- " + ((GPS) bike).getCurrentLocation());

        System.out.println();

        System.out.println(auto.getVehicleDetails());
        System.out.println("Fare for 5 km- " + auto.calculateFare(5));
        System.out.println("Current Location- " + ((GPS) auto).getCurrentLocation());
        ((GPS) auto).updateLocation("Market");
        System.out.println("Updated Location- " + ((GPS) auto).getCurrentLocation());
    }
}