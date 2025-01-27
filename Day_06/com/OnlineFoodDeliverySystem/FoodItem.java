package com.OnlineFoodDeliverySystem;

//abstract class FoodItem
public abstract class FoodItem {
    //data members
    private String itemName;
    private double price;
    private int quantity;

    //constructor
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    //getters
    public String getItemName() {
        return itemName;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }

    //abstract method
    public abstract double calculateTotalPrice();

    //concrete method
    public String getItemDetails() {
        return "Item: " + itemName + ", Price per unit: " + price + ", Quantity: " + quantity;
    }
}