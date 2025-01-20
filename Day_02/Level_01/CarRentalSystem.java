class CarRental {
        String customerName;
        String carModel;
        int rentalDays;

        //parameterised constructor
    CarRental(String customerName, String carModel, int rentalDays){
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    //method to Calculate total cost
   public int calculateTotalCost(int rentalDays){
           int perDayRent = 100;
           int total = rentalDays*perDayRent;
           return total;
    }

    //method for displaying details
    public void displayDetails(){
        System.out.println("Customer name - " + customerName);
        System.out.println("CarModel - " + carModel);
        System.out.println("Rental Days - " + rentalDays);
        System.out.println("Calculate total cost - " + calculateTotalCost(rentalDays));
    }
}
public class CarRentalSystem {
    public static void main(String[] args) {

        // object of CarRental class
         CarRental obj = new CarRental("Subha","Toyota Camry", 3);
         System.out.println("Car rental system details - ");

         //calling display method
         obj.displayDetails();
    }
}
