package com.OnlineFoodDeliverySystem;

//subclass nonVegItem class
class NonVegItem extends FoodItem implements Discountable {
    //additional charge per item
    private static final double additionalMoney= 10;
    private double discount;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discount = 0;
    }

    //calculate total price
    @Override
    public double calculateTotalPrice() {
        return (getQuantity() * getPrice()) + (getQuantity() * additionalMoney);
    }
  //apply and get discount
    @Override
    public double applyDiscount(double discountRate) {
        double total = calculateTotalPrice();
        discount = total * discountRate / 100;
        return total - discount;
    }

    @Override
    public String getDiscountDetails() {
        return "Discount applied - " + discount;
    }
}
