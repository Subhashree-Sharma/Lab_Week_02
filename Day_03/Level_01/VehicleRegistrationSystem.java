class Vehicle{
   static int registrationFee;
   String ownerName;
   String vehicleType;
   final int registrationNumber;

   //constructor
   Vehicle(int registrationFee, String ownerName, String vehicleType, int registrationNumber){
       Vehicle.registrationFee = registrationFee;
       this.ownerName = ownerName;
       this.vehicleType = vehicleType;
       this.registrationNumber = registrationNumber;
   }

    // Static method to update the registration fee
    public static void updateRegistrationFee(int newFee) {
        registrationFee = newFee;
    }

    //using method to display vehicle details
    public void displayDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Registration Fee: " + registrationFee);
    }

}

public class VehicleRegistrationSystem {
    public static void main(String[] args) {

        //obj of vehicle class
        Vehicle obj = new Vehicle(500, "Subha", "Car", 22);

        //checking if it is instance of class or not
        boolean isTrue = obj instanceof Vehicle;
        if(isTrue){
            Vehicle.updateRegistrationFee(600);
            obj.displayDetails();
        }else{
            System.out.println("Not an instance of class vehicle ");
        }

    }
}
