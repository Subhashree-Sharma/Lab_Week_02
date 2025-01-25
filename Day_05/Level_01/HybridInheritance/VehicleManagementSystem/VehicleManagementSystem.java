package HybridInheritance.VehicleManagementSystem;

//Vehicle superclass
class Vehicle {
    private int maxSpeed;
    private String model;

    //constructor
    Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    //using method to display basic vehicle details
    public void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

//interface- Refuelable
interface Refuelable {

    //abstract method to be implemented by petrol vehicles
    void refuel();
}

//Subclass- ElectricVehicle
class ElectricVehicle extends Vehicle {
    private int batteryCapacity;

    //constructor
    ElectricVehicle(int maxSpeed, String model, int batteryCapacity) {
        super(maxSpeed, model);
        this.batteryCapacity = batteryCapacity;
    }

    //using method to display EV-specific details
    public void charge() {
        System.out.println("Charging the electric vehicle...");
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }

    //display role and details
    public void displayRole() {
        System.out.println("Role: Electric Vehicle");
        displayDetails();
        charge();
    }
}

//subclass PetrolVehicle
class PetrolVehicle extends Vehicle implements Refuelable {
    private int fuelCapacity;

    // Constructor
    PetrolVehicle(int maxSpeed, String model, int fuelCapacity) {
        super(maxSpeed, model);
        this.fuelCapacity = fuelCapacity;
    }

    //implement refuel method from Refuelable interface
    @Override
    public void refuel() {
        System.out.println("Refueling the petrol vehicle...");
        System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
    }

    //display role and details
    public void displayRole() {
        System.out.println("Role: Petrol Vehicle");
        displayDetails();
        refuel();
    }
}

//main class
public class VehicleManagementSystem {
    public static void main(String[] args) {

        //create an ElectricVehicle object
        ElectricVehicle ev = new ElectricVehicle(150, "Tesla Model 3", 75);
        System.out.println("Electric Vehicle Details:");
        ev.displayRole();
        System.out.println();

        //create a PetrolVehicle object
        PetrolVehicle pv = new PetrolVehicle(180, "Toyota Corolla", 50);
        System.out.println("Petrol Vehicle Details:");
        pv.displayRole();
    }
}
