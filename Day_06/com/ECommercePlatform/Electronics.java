package com.ECommercePlatform;

//Subclass electronics
public class Electronics extends Product implements Taxable{

    //data members
    private double discountRate;
    private double taxRate;

    //constructor
    public Electronics(int productId, String name, int price, double discountRate, double taxRate) {
        super(productId, name, price);
        this.discountRate = discountRate;
        this.taxRate = taxRate;
    }

    // calculate discount
    public double calculateDiscount(){
        return getPrice() * discountRate/100;
    }

    //calculate tax
    public double calculateTax(){
        return getPrice() * taxRate/100;
    }

    //get tax
    public double getTaxDetails(){
        return taxRate;
    }
}
