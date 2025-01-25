package MultilevelInheritance.OnlineRetailOrderManagement;

//order class - superclass
class Order {
    private int orderId;
    private String orderDate;

    // Constructor
    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
    //using method to display order status
    public void getOrderStatus() {
        System.out.println("Order Details:");
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
    }
}

// Subclass - ShippedOrder
class ShippedOrder extends Order {
    private int trackingNumber;

    // Constructor
    ShippedOrder(int orderId, String orderDate, int trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    //overriding getOrderStatus
    @Override
    public void getOrderStatus() {
        super.getOrderStatus();
        System.out.println("Tracking Number: " + trackingNumber);
        System.out.println("Order Status: Shipped");
    }
}

//subclass- DeliveredOrder
class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    //constructor
    DeliveredOrder(int orderId, String orderDate, int trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    //overriding getOrderStatus
    @Override
    public void getOrderStatus() {
        super.getOrderStatus();
        System.out.println("Delivery Date: " + deliveryDate);
        System.out.println("Order Status: Delivered");
    }
}

//main class
public class OrderManagement {
    public static void main(String[] args) {

        //create obj of ShippedOrder
        ShippedOrder shippedOrder = new ShippedOrder(101, "2025-01-15", 98765);
        System.out.println("Shipped Order:");

        //calling method to display status
        shippedOrder.getOrderStatus();
        System.out.println();

        // create obj of delivered order
        DeliveredOrder deliveredOrder = new DeliveredOrder(102, "2025-01-10", 12345, "2025-01-20");
        System.out.println("Delivered Order:");
        deliveredOrder.getOrderStatus();
    }
}
