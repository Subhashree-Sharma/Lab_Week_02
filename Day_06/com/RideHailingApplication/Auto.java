package com.RideHailingApplication;
//Subclass Auto
class Auto extends Vehicle implements GPS {
    private String currentLocation;
   //constructor
    public Auto(int vehicleId, String driverName, double ratePerKm, String initialLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = initialLocation;
    }
 // calculate fare
    @Override
    public double calculateFare(double distance) {
        // Autos have a minimum base fare of 50
        return Math.max(50, distance * getRatePerKm());
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
