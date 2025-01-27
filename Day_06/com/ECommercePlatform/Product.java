package com.ECommercePlatform;
//abstract class
public abstract class Product {
    //private data members
    private int productId;
    private String name;
    private int price;

    //product constructor
    Product(int productId, String name, int price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    //abstract method
    public abstract double calculateDiscount();

    //using getter and setter methods
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //displaying details
    public void displayDetails() {
        System.out.println("Product Id - " + productId + " Product name - " + name + " Price - " + price);
    }
}