import java.util.ArrayList;

//Bank class
class Bank {
    private String name;
    private ArrayList<Customer> customers;

    //constructor
    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    //using method to open an account for a customer
    public void openAccount(Customer customer, Account account) {
        customer.addAccount(account);
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
    }

    //using method to list all customers
    public void listCustomers() {
        System.out.println("Bank: " + name);
        for (Customer customer : customers) {
            System.out.println("Customer: " + customer.getName());
        }
    }
}

//customer class
class Customer {
    private String name;
    private ArrayList<Account> accounts;

    //Constructor
    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    //Get customer name
    public String getName() {
        return name;
    }

    //Add account
    public void addAccount(Account account) {
        accounts.add(account);
    }

    // View balance for all accounts
    public void viewBalance() {
        System.out.println("Customer: " + name);
        for (Account account : accounts) {
            System.out.println("Account: " + account.getAccountNumber() + ", Balance: " + account.getBalance());
        }
    }
}

//Account class
class Account {
    private String accountNumber;
    private double balance;

    //constructor
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Get account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Get balance
    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {
        balance += amount;
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}

//main class
public class BankAndAccountHolders {
    public static void main(String[] args) {
        Bank bank = new Bank("State Bank");

        Customer customer1 = new Customer("Subha");
        Customer customer2 = new Customer("Shree");

        Account account1 = new Account("Acc123", 5000);
         Account account2 = new Account("Ac124", 3000);
        Account account3 = new Account("Acc25", 7000);

        bank.openAccount(customer1, account1);
        bank.openAccount(customer1, account2);
        bank.openAccount(customer2, account3);

        customer1.viewBalance();
        customer2.viewBalance();

        bank.listCustomers();
    }
}
