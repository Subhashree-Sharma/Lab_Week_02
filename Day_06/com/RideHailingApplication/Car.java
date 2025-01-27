package com.RideHailingApplication;
// Subclass Car
class Car extends Vehicle implements GPS {
    private String currentLocation;
    //constructor
    public Car(int vehicleId, String driverName, double ratePerKm, String initialLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = initialLocation;
    }
   //calculate fare
    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
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

