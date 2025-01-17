
import java.util.Scanner;

	class MobilePhone{
		String brand;
		int model;
		int price;
	
	//constructor 
	MobilePhone(String brand, int model, int price) {
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	//using method to displaydetails
	public void DisplayDetails(){
		System.out.println("Brand name - " + brand);
		System.out.println("Model - " + model);
		System.out.println("Price - " + price);
	}
}	

public class MobilePhonesDetails{

public static void main(String[] args){

	//Using scanner object for taking inputs
	Scanner sc = new Scanner(System.in);

	//Take brand, model, price
	System.out.println("Enter the brand name - ");
	String brand = sc.next();

	System.out.println("Enter the model - ");
	int model = sc.nextInt();

	System.out.println("Enter the price of mobile phone");
	int price = sc.nextInt();

	//creating object of mobilephone class
	MobilePhone details = new MobilePhone(brand, model, price);
	
	//calling method
	details.DisplayDetails();


	//closing scanner
	sc.close();
	}
}