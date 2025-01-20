import java.util.Scanner;

class BankAccount {
    //static and final variable
    static String bankName;
    final Long accountNumber;
    private String accountHolderName;
    static int numberOfAcc = 0;

    // Constructor
    BankAccount(String bankName, String accountHolderName, Long accountNumber) {
        BankAccount.bankName = bankName;
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        numberOfAcc++;
    }

    //static method to display the total number of accounts
    public static void getTotalAccounts() {
        System.out.println("Total number of accounts are: " + numberOfAcc);
    }

    //instance method to display account details
    public void displayDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
    }
}

public class BankAccountSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for account details
        System.out.println("Enter the bank name: ");
        String bankName = sc.next();

        System.out.println("Enter the account holder name: ");
        String accountHolderName = sc.next();

        System.out.println("Enter the account number: ");
        Long accountNumber = sc.nextLong();

        //new BankAccount object
        BankAccount account = new BankAccount(bankName, accountHolderName, accountNumber);

        //check if the object is an instance of BankAccount
        if (account instanceof BankAccount) {

            //calling methods
            BankAccount.getTotalAccounts();
            account.displayDetails();
        } else {
            System.out.println("This is not an instance of the BankAccount class.");
        }

        sc.close();
    }
}
