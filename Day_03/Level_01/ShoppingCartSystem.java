class Product{

    //static, final variables
    static int discount;
    String productName;
    int price;
    int quantity;
    final int productID;

    //constructor
    Product(int discount, String productName, int price, int quantity, int productID){
        Product.discount = discount;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    //update discount method
   public static void updateDiscount(int updatediscount){
       discount = updatediscount;
    }

    //method to display details
    public void displayDetails(){
        System.out.println("Discount in the product - " + discount);
         System.out.println("Product Name - " + productName);
        System.out.println("price of the product - " + price);
        System.out.println("Quantity of the product - " + quantity);
        System.out.println("Product ID of the product - " + productID);
    }
}

public class ShoppingCartSystem {
    public static void main(String[] args) {

        //obj of product class
        Product obj = new Product(10, "Pen" , 10, 5, 22);

        //checking instance of product class and displaying result
        if(obj instanceof Product){
            Product.updateDiscount(5);
            obj.displayDetails();
        }
        else{
            System.out.println("Not an instance of class Product");
        }
    }
}
