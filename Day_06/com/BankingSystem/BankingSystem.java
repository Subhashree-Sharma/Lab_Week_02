package com.BankingSystem;

//main class
public class BankingSystem {
    public static void main(String[] args) {

        //accounts object
        BankAccount savingsAccount = new SavingsAccount(12345, "Subhashree", 50000, 10,2);
        BankAccount currentAccount = new CurrentAccount(98745, "Riya", 10000, 5, 3);

        //Displaying saving account, current account details
        System.out.println("Savings Account details - ");
        savingsAccount.deposit(5000);
        savingsAccount.withdraw(2000);
        System.out.println("Interest - " + savingsAccount.calculateInterest());

        System.out.println("\nCurrent Account-");
        currentAccount.deposit(3000);
        currentAccount.withdraw(1500);
        System.out.println("Interest - " + currentAccount.calculateInterest());

        //loan eligibility
        System.out.println("\nLoan Eligibility-");
        Loanable loanableSavingsAccount = (Loanable) savingsAccount;
        loanableSavingsAccount.applyForLoan(100000);

        Loanable loanableCurrentAccount = (Loanable) currentAccount;
        loanableCurrentAccount.applyForLoan(50000);

    }
}
