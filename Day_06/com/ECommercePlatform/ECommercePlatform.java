package com.ECommercePlatform;
import java.util.ArrayList;

//main class
public class ECommercePlatform {
    public static void main(String[] args) {

        //using ArrayList to store products
        ArrayList<Product> products = new ArrayList<>();

        //create obj of clothing, electronics, groceries
        Clothing cloth = new Clothing(34, "dress", 5000, 20,5);
        Electronics electronic = new Electronics(22, "phone", 30000, 34,10);
        Groceries grocery = new Groceries(45, "Rice", 1000, 5);

        //adding products
        products.add(cloth);
        products.add(electronic);
        products.add(grocery);

        //displaying details
        cloth.displayDetails();
        System.out.println("Cloth discount, total tax , calculated tax - " + cloth.calculateDiscount() +", " + cloth.getTaxDetails() + ", " + cloth.calculateTax() + "\n");
        electronic.displayDetails();
        System.out.println("Electronics Discount , total tax, calculated tax - " + electronic.calculateDiscount() + ", " + electronic.getTaxDetails() +", " +electronic.calculateTax() +"\n");
        grocery.displayDetails();
        System.out.println("Grocery discount, total tax, calculated tax - " + grocery.calculateDiscount() + ", " + grocery.getTaxDetails() + ", " + grocery.calculateTax() + "\n");
        System.out.println("Final price - "+ grocery.calculateFinalPrice() + ", " + "discount rate "+ grocery.getDiscountRate());
    }
}
