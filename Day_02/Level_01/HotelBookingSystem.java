
class HotelBooking{
   String guestName;
   String roomType;
   int nights;

   //using parameterised constructor
    HotelBooking(String guestName, String roomType, int nights){
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    //default constructor
    public HotelBooking() {
        this.guestName = "Shree";
        this.roomType = "3BHK";
        this.nights = 1;
    }

    //copy constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    //using method to display details
    public void displayDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Number of Nights: " + nights);
    }
}

public class HotelBookingSystem {
    public static void main(String[] args) {

        //object for parameterised constructor
        HotelBooking para = new HotelBooking("Subha", "4BHK", 2);
        System.out.println("Parameterised - Booking Details: -");
        para.displayDetails();

        //for copy constructor
        HotelBooking copy = new HotelBooking(para);
        System.out.println("Copy Constructor - Booking Details :- ");
        copy.displayDetails();

        //for default constructor
        HotelBooking defaultObj = new HotelBooking();
        System.out.println("Default Constructor - Booking details :- ");
        defaultObj.displayDetails();
    }
}
