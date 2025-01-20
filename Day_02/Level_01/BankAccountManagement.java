
class BankAccount {
    //public member
    public String accountNumber;

    //protected member
    protected String accountHolder;

    // Private member
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}

// SavingsAccount class to demonstrate access to BankAccount members
class SavingsAccount extends BankAccount {

    // Constructor
    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    // Method to display savings account details
    public void displaySavingsAccountDetails() {
        System.out.println("Savings Account Details:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
    }
}

public class BankAccountManagement {
    public static void main(String[] args) {
        //creating a BankAccount object
        BankAccount bankAccount = new BankAccount("123456789", "John Doe", 5000.0);

        // Display account details
        bankAccount.displayAccountDetails();

        // Access and modify balance
        bankAccount.setBalance(6000.0);
        System.out.println("\n Updated Balance: $" + bankAccount.getBalance());

        // Creating a SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount("987654321", "Jane Doe", 10000.0);

        //display savings account details
        savingsAccount.displaySavingsAccountDetails();
    }
}

