import java.util.Scanner;

   class Book{

	String title;
	String author;
	int price;
	
	//constructor to initialize the book details
    Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
	//using method to display book details

	public void DisplayDetails(){

	System.out.println("These are the details of a book -  ");
	System.out.println("Book title - " + title);
	System.out.println("Book author - " + author);
	System.out.println("Book price - " + price);
    }
}

public class Book_Details{

	public static void main(String[] args){

	//Using scanner object for taking inputs
	Scanner sc = new Scanner(System.in);

	//Take user input for title, author, price
	System.out.println("Enter the title of a book - ");
	String title = sc.next();

	System.out.println("Enter the name of the author - ");
	String author = sc.next();

	System.out.println("Enter the price of book - ");
	int price = sc.nextInt();

	Book details = new Book(title, author, price);
	
	//calling display details method
	details.DisplayDetails();

	//scanner close
	sc.close();
	}
   }
	