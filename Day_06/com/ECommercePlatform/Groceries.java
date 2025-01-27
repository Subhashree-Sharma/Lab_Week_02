package com.ECommercePlatform;

//subclass groceries
public class Groceries extends Product implements Taxable{

    //data members
    private double discountRate;
    private double tax;

    //constructor
    public Groceries(int productId, String name, int price, double discountRate) {
        super(productId, name, price);
        this.discountRate = discountRate;
    }

    //calculate discount
    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate / 100;
    }

    //calculate Tax
    public double calculateTax(){
        return getPrice()*tax/100;
    }

    //getTaxDetails
    public double getTaxDetails(){
        return tax;
    }

    //calculateFinalPrice and getDiscountRate
    public double calculateFinalPrice() {
        return getPrice() - calculateDiscount() + calculateTax();
    }

    public double getDiscountRate() {
        return discountRate;
    }

}
