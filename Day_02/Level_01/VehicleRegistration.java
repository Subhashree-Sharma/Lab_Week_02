import java.util.Scanner;

class Vehicle {
    //instance Variables
    private String ownerName;
    private String vehicleType;

    //static Class Variable
    private static double registrationFee = 1000.0;

    // Constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    //instance Method to Display Vehicle Details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    //static Method to Update Registration Fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: " + registrationFee);
    }
}

public class VehicleRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input Vehicle Details
        System.out.println("Enter owner name:");
        String ownerName = sc.nextLine();

        System.out.println("Enter vehicle type:");
        String vehicleType = sc.nextLine();

        // Create Vehicle Object
        Vehicle vehicle = new Vehicle(ownerName, vehicleType);

        // Update Registration Fee
        System.out.println("Enter new registration fee:");
        double newFee = sc.nextDouble();
        Vehicle.updateRegistrationFee(newFee);

        //display Vehicle Details
        System.out.println("Vehicle Details:");
        vehicle.displayVehicleDetails();

        // Close the scanner
        sc.close();
    }
}

