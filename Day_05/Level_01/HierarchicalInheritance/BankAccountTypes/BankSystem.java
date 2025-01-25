package HierarchicalInheritance.BankAccountTypes;

//BankAccount superclass
class BankAccount {
    private String accountNumber;
    private double balance;

    //constructor
    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //using method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

//SavingsAccount subclass
class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor
    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    //method to display account type and details
    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        displayAccountDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

//checkingAccount subclass
class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    // Constructor
    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    //method to display account type and details
    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        displayAccountDetails();
        System.out.println("Withdrawal Limit: $" + withdrawalLimit + " per day");
    }
}

//FixedDepositAccount subclass
class FixedDepositAccount extends BankAccount {
    private int depositTerm;

    // Constructor
    FixedDepositAccount(String accountNumber, double balance, int depositTerm) {
        super(accountNumber, balance);
        this.depositTerm = depositTerm;
    }

    //method to display account type and details
    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        displayAccountDetails();
        System.out.println("Deposit Term: " + depositTerm + " months");
    }
}

//main class
public class BankSystem {
    public static void main(String[] args) {

        //create a SavingsAccount object
        SavingsAccount savings = new SavingsAccount("SA12345", 5000.0, 3.5);
        System.out.println("Savings Account Details:");
        savings.displayAccountType();
        System.out.println();

        //create a CheckingAccount object
        CheckingAccount checking = new CheckingAccount("CA54321", 2000.0, 1000.0);
        System.out.println("Checking Account Details:");
        checking.displayAccountType();
        System.out.println();

        //create a FixedDepositAccount object
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FDA67890", 10000.0, 12);
        System.out.println("Fixed Deposit Account Details:");
        fixedDeposit.displayAccountType();
    }
}
