import java.util.Scanner;
class Product {

    //instance variables
    private String productName;
    private double price;

    // Static class variable
    private static int totalProducts = 0;

    // Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    //method to calculate total cost for a given quantity
    public double calculateTotalCost(int quantity) {
        return quantity * price;
    }

    //instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price of the Product: " + price);
    }

    //static method to display total number of products
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }
}

public class ProductInventory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input details for the product
        System.out.println("Enter product name:");
        String productName = sc.nextLine();

        System.out.println("Enter product price:");
        double price = sc.nextDouble();

        //create a product object
        Product product = new Product(productName, price);

        System.out.println("Enter quantity:");
        int quantity = sc.nextInt();

        //display details and total cost
        System.out.println("\nProduct Details:");
        product.displayProductDetails();
        System.out.println("Total Cost for " + quantity + " units: " + product.calculateTotalCost(quantity));

        //display total products
        Product.displayTotalProducts();

        //close the scanner
        sc.close();
    }
}
