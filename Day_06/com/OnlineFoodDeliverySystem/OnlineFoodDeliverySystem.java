package com.OnlineFoodDeliverySystem;

//main class
public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {

        //food item objects
        FoodItem vegItem = new VegItem("Matar paneer", 150, 2);
        FoodItem nonVegItem = new NonVegItem("Biryani", 250, 1);

        //process order for VegItem
        System.out.println(vegItem.getItemDetails());
        System.out.println("Total Price before discount- " + vegItem.calculateTotalPrice());
        Discountable vegDiscount = (Discountable) vegItem;
        System.out.println("Total Price after discount- " + vegDiscount.applyDiscount(10));
        System.out.println(vegDiscount.getDiscountDetails());

        System.out.println();

        //process order for NonVegItem
        System.out.println(nonVegItem.getItemDetails());
        System.out.println("Total Price (before discount): " + nonVegItem.calculateTotalPrice());
        Discountable nonVegDiscount = (Discountable) nonVegItem;
        System.out.println("Total Price (after discount): " + nonVegDiscount.applyDiscount(15));
        System.out.println(nonVegDiscount.getDiscountDetails());
    }
}