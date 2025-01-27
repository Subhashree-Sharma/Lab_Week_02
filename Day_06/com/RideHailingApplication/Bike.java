package com.RideHailingApplication;

//Subclass Bike
class Bike extends Vehicle implements GPS {
    private String currentLocation;
    //constructor
    public Bike(int vehicleId, String driverName, double ratePerKm, String initialLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = initialLocation;
    }
    //calculate fare
    @Override
    public double calculateFare(double distance) {
        // Bikes have a discount for short distances
        return distance <= 10 ? distance * getRatePerKm() * 0.9 : distance * getRatePerKm();
    }
    //get and update location
    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }
    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}
