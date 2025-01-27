package com.ECommercePlatform;

//subclass Clothing
public class Clothing extends Product implements Taxable{

    //data members
    private double discount;
    private double tax;

    //clothing class constructor
    Clothing(int productId, String name, int price, double discount, double tax){
        super(productId, name, price);
        this.discount = discount;
        this.tax = tax;
    }

    //calculate discount
    public double calculateDiscount(){
        return getPrice()*discount/100;
    }

    //calculate tax and get details
    public double calculateTax(){
        return getPrice()*tax/100;
    }

    public double getTaxDetails(){
        return tax;
    }
}
