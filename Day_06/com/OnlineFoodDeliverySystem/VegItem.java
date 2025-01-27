package com.OnlineFoodDeliverySystem;

//subclass vegItem class
class VegItem extends FoodItem implements Discountable {
    private double discount;

    //constructor
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discount = 0;
    }
   //calculate total price
    @Override
    public double calculateTotalPrice() {
        return getQuantity() * getPrice();
    }

    //apply discount and get discount details
    @Override
    public double applyDiscount(double discountRate) {
        double total = calculateTotalPrice();
        discount = total * discountRate / 100;
        return total - discount;
    }

    @Override
    public String getDiscountDetails() {
        return "Discount applied: " + discount;
    }
}