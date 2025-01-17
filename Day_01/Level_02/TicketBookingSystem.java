package Day_06.Level_02;

import java.util.Scanner;

class MovieTicket {

    String movieName;
    int seatNumber;
    int price;

    //constructor to initialize the MovieTicket object

    public MovieTicket(String movieName, int seatNumber, int price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

   //using method to book a ticket , assigning seat and update price
    public void bookTicket(int seatNumber, int price) {

        this.seatNumber = seatNumber;
        this.price = price;
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price - " + price);
    }
}

public class TicketBookingSystem {

    public static void main(String[] args) {

	//using scanner for taking inputs
        Scanner sc = new Scanner(System.in);

       //Take movieName, seatNumber, and price as input
        System.out.println("Enter the movie name:");
        String movieName = sc.nextLine(); 

        System.out.println("Enter the seat number:");
        int seatNumber = sc.nextInt();

        System.out.println("Enter the ticket price:");
        int price = sc.nextInt();

       //create a MovieTicket object
        MovieTicket ticket = new MovieTicket(movieName, seatNumber, price);

       //printing the results
        System.out.println("\nThe Details of movie ticket - ");
        ticket.displayTicketDetails();

	//closing the scanner
	sc.close();
    }
}
