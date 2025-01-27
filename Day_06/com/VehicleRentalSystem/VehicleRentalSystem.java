package com.VehicleRentalSystem;

//main class
public class VehicleRentalSystem {
    public static void main(String[] args) {

        //obj of different vehicles
        Vehicle car = new Car(123,"Taarzan the wonder car", 100);
        Vehicle bike = new Bike(234, "honda", 50);
        Vehicle truck = new Truck(456,"Transport Truck", 200);

        //displaying details of car, bike and truck
        System.out.println(car.toString());
        System.out.println("Car rental cost - " + car.calculateRentalCost(3));
        System.out.println("Car insurance- " + ((Insurable) car).calculateInsurance(4));
        System.out.println("car insurance details - " + ((Insurable) car).getInsuranceDetails(1234));
        System.out.println();

        System.out.println(bike.toString());
        System.out.println("bike rental Cost - " + bike.calculateRentalCost(4));
        System.out.println("bike insurance- " + ((Insurable) bike).calculateInsurance(3));
        System.out.println("insurance Details -  " + ((Insurable) bike).getInsuranceDetails(54321));
        System.out.println();

        System.out.println(truck.toString());
        System.out.println("truck rental Cost: " + truck.calculateRentalCost(2));
        System.out.println("insurance: " + ((Insurable) truck).calculateInsurance(5));
        System.out.println("insurance Details: " + ((Insurable) truck).getInsuranceDetails(67890));
    }
}
