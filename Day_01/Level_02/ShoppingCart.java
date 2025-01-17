package Day_06.Level_02;

import java.util.Scanner;

class CartItem {
    String itemName;
    int price;
    int quantity;

   //using constructor to initialize item attributes
    public CartItem(String itemName, int price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

   //using method to calculate the total cost for this item
    public int getTotalCost() {
        return price * quantity;
    }
}

public class ShoppingCart {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CartItem[] cart = new CartItem[10]; 

    // Tracks the number of items in the cart
        int itemCount = 0; 

        while (true) {

            // Display menu
            System.out.println("\nMenu:");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Display Total Cost");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            // Handle choices without using `switch`
            if (choice == 1) { // Add Item
                if (itemCount >= cart.length) {
                    System.out.println("Cart is full!");
                    continue;
                }
                System.out.print("Enter item name -  ");
                sc.nextLine(); 
                String itemName = sc.nextLine();

                System.out.print("Enter item price - ");
                int price = sc.nextInt();

                System.out.print("Enter item quantity - ");
                int quantity = sc.nextInt();

                cart[itemCount++] = new CartItem(itemName, price, quantity);
                System.out.println("Item added to the cart!");
            } 

	// Remove Item
            else if (choice == 2) { 
                System.out.print("Enter the item number to remove (1 to " + itemCount + "): ");
                int itemNumber = sc.nextInt();
                if (itemNumber < 1 || itemNumber > itemCount) {
                    System.out.println("Invalid item number!");
                } else {
                    for (int i = itemNumber - 1; i < itemCount - 1; i++) {
                        cart[i] = cart[i + 1];
                    }

		// Reduce the item count and clear the last slot
                    cart[--itemCount] = null; 
                    System.out.println("Item removed from the cart!");
                }
            } 

		 // Display Total Cost
            else if (choice == 3) {
                int totalCost = 0;
                for (int i = 0; i < itemCount; i++) {
                    totalCost += cart[i].getTotalCost();
                }
                System.out.println("Total cost of items in the cart: ₹" + totalCost);
            } 

		// Exit
            else if (choice == 4) {
                System.out.println("Exiting the program.");
                sc.close();
                break;
            } 
            else {
                System.out.println("Invalid choice! Please try again.");
            } }
   }
}
