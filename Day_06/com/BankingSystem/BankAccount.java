package com.BankingSystem;

//abstract base class
public abstract class BankAccount {
    //data members
    private int accountNumber;
    private String holderName;
    private double balance;

    //base class constructor
    BankAccount(int accNo, String name, double bal) {
        accountNumber = accNo;
        holderName = name;
        balance = bal;
    }

    //using getter and setter methods for private data members
    public int getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(){
        this.accountNumber = accountNumber;
    }
    public String getHolderName(){
        return holderName;
    }
    public void setHolderName(){
        this.holderName = holderName;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(){
        this.balance = balance;
    }
    //deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited - " + amount + " New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    //withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn - " + amount + " Remaining Balance: " + balance);
        } else {
            System.out.println("invalid insufficient balance ");
        }
    }

    public abstract double calculateInterest();
}

