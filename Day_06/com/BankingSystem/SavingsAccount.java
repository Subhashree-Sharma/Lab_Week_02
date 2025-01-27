package com.BankingSystem;
//subclass SavingsAccount
public class SavingsAccount extends BankAccount implements Loanable{

    //data members
    private int rate;
    private int time;

    //constructor
    SavingsAccount(int accountNumber, String holderName, double balance, int rate, int time) {
        super(accountNumber, holderName, balance);
        this.rate = rate;
        this.time = time;
    }

    //calculating simple interest
    public double calculateInterest(){
        return (getBalance() * rate *time)/100;
    }

    //apply for loan
    public boolean applyForLoan(double amount) {

        //loan eligibility criteria for savings accounts
        if (amount <= calculateLoanEligibility()) {
            System.out.println("Loan is approved for - " + amount + " rupees");
            return true;
        }
        System.out.println("Loan application denied");
        return false;
    }

    //loan eligibility is thrice the balance
    public double calculateLoanEligibility() {
        return getBalance() * 3;
    }
}
