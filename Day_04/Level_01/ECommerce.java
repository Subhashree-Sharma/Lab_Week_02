import java.util.ArrayList;
import java.util.List;

//product class
class Product {
    private String name;
    private double price;

    //constructor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    //get name and price
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

//order class
class Order {
    private int orderId;
    private List<Product> products;
    private double totalAmount;

    //constructor
    public Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
        this.totalAmount = 0.0;
    }

    public int getOrderId() {
        return orderId;
    }

    //add product
    public void addProduct(Product product) {
        products.add(product);
        totalAmount += product.getPrice();
    }

    //display details
    public void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Products in the Order:");
        for (Product product : products) {
            System.out.println(" - " + product.getName() + ": $" + product.getPrice());
        }
        System.out.println("Total Amount: $" + totalAmount);
    }
}

//customer class
class Customerr {
    private String name;
    private List<Order> orders;

    //constructor
    public Customerr(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    //place order
    public void placeOrder(Order order) {
        orders.add(order);
    }

    //display order history
    public void showOrderHistory() {
        System.out.println("Order History for " + name + ":");
        for (Order order : orders) {
            order.showOrderDetails();
            System.out.println();
        }
    }
}

//main class
public class ECommerce {
    public static void main(String[] args) {
        //create products
        Product product1 = new Product("Laptop", 1200.99);
        Product product2 = new Product("Smartphone", 799.49);
         Product product3 = new Product("Headphones", 199.99);
        Product product4 = new Product("Smartwatch", 249.99);

        //create customers
        Customerr customer1 = new Customerr("Alice");
        Customerr customer2 = new Customerr("Bob");

        //create orders
        Order order1 = new Order(101);
        Order order2 = new Order(102);
        Order order3 = new Order(103);

        //add products to orders
        order1.addProduct(product1);
        order1.addProduct(product3);

        order2.addProduct(product2);
        order2.addProduct(product4);

        order3.addProduct(product3);
        order3.addProduct(product4);

        //customers place orders
        customer1.placeOrder(order1);
        customer1.placeOrder(order2);

        customer2.placeOrder(order3);

        //show order details
        System.out.println(" Customer Orders - ");
        customer1.showOrderHistory();
        customer2.showOrderHistory();
    }
}
