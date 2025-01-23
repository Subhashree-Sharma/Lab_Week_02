import java.util.ArrayList;
import java.util.List;

//customer Class
class Customer {
    private String customerName;
    private int customerID;
    private List<Product> purchasedProducts;

    //constructor
    Customer(String customerName, int customerID) {
        this.customerName = customerName;
        this.customerID = customerID;
        this.purchasedProducts = new ArrayList<>();
    }

    public String getName() {
        return customerName;
    }

    public int getCustomerID() {
        return customerID;
    }

    public List<Product> getPurchasedProducts() {
        return purchasedProducts;
    }

    //add products
    public void addProduct(Product product) {
        purchasedProducts.add(product);
    }
}

//product Class
class Product {
    private String productName;
    private double productPrice;

    //quantity in kg or liters
    private double quantity;

    //constructor
    Product(String productName, double productPrice, double quantity) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getTotalPrice() {
        return productPrice * quantity;
    }
}

//BillGenerator class
class BillGenerator {
    public static double generateBill(Customer customer) {
        double totalBill = 0;

        for (Product product : customer.getPurchasedProducts()) {
            totalBill += product.getTotalPrice();
        }

        return totalBill;
    }
}

public class BillGenerateApplication {
    public static void main(String[] args) {

        //Customer class object
        Customer customer = new Customer("Subhashree", 164);

        //add products to the customer's purchase List
        customer.addProduct(new Product("Apples", 3.0, 2.0));
        customer.addProduct(new Product("Milk", 2.0, 1.0));

        //generate and print the Bill
        double totalBill = BillGenerator.generateBill(customer);
        //calling getName and getCustomerId method
        System.out.println("Customer - " + customer.getName());
        System.out.println("Customer Id - " + customer.getCustomerID());

        //displaying result
        System.out.println("Purchased Products - ");
        for (Product product : customer.getPurchasedProducts()) {
            System.out.println("- " + product.getProductName() +" "+product.getQuantity() +
                    " kg at $" + product.getProductPrice() + " per kg - $" + product.getTotalPrice());
        }
        System.out.println("Total Bill -  $" + totalBill);
    }
}
