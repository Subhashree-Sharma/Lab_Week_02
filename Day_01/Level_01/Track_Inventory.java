
import java.util.Scanner;

class Item {

	int itemCode;
	String itemName;
	int price;

	Item(int itemCode, String itemName, int price){
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.price = price;
	}
	
	public void DisplayDetails(){
		System.out.println("The details of a item - ");
		System.out.println("Item Code - " + itemCode);
		System.out.println("Item name - " + itemName);
		System.out.println("Item Price - " + price);
	}

	public int CalculateTotal(int quantity){
		return price*quantity;
		}

	}
public class Track_Inventory{

public static void main(String[] args){

	//using scanner object for taking inputs
	Scanner sc = new Scanner(System.in);

	//Take itemCode, itemName, and price as input
	
	System.out.println("Enter the item code - ");
	int itemCode = sc.nextInt();

	System.out.println("Enter the item name - ");
	String itemName = sc.next();

	System.out.println("Enter the price of a item");
	int price = sc.nextInt();

	Item details = new Item(itemCode, itemName, price);
	
	details.DisplayDetails();
	details.CalculateTotal(3);
	
	sc.close();
	}
}