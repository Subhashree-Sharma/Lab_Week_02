package Day_06.Level_02;

import java.util.Scanner;

class BankAccount {
	String accountholder;
	long accountNumber;
	long balance;

	// Constructor to initialize attributes
	public BankAccount(String accountholder, long accountNumber, long balance) {
		this.accountholder = accountholder;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	// Deposit money
	public void depositMoney(long money) {
		if (money > 0) {
			balance += money;
			System.out.println("Deposited: " + money);
		} else {
			System.out.println("Invalid amount.");
		}
	}

	// Withdraw money
	public void withdrawMoney(long money) {
		if (money > 0 && money <= balance) {
			balance -= money;
			System.out.println("Withdrawn: " + money);
		} else {
			System.out.println("Insufficient balance or invalid amount.");
		}
	}
	//display balance
	public void displayBalance() {
		System.out.println("Account Holder: " + accountholder);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Current Balance: " + balance);
	}
}

public class SimulateATM {
	public static void main(String[] args) {

		//using scanner object for taking inputs
		Scanner sc = new Scanner(System.in);

		//taking user input
		System.out.print("Enter account holder's name: ");
		 String accountholder = sc.nextLine();

		System.out.print("Enter account number: ");
		long accountNumber = sc.nextLong();

		System.out.print("Enter initial balance: ");
		long balance = sc.nextLong();

		BankAccount account = new BankAccount(accountholder, accountNumber, balance);

		while (true) {
			System.out.println("\n1. View Balance");
			 System.out.println("2. Deposit Money");
			System.out.println("3. Withdraw Money");
			System.out.println("4. Exit");
			System.out.print("Choose an option: ");
			int choice = sc.nextInt();

			switch (choice) {
				case 1:
					account.displayBalance();
					break;
				case 2:
					System.out.print("Enter amount to deposit: ");
					long deposit = sc.nextLong();
					account.depositMoney(deposit);
					break;
				case 3:
					System.out.print("Enter amount to withdraw: ");
					long withdraw = sc.nextLong();
					account.withdrawMoney(withdraw);
					break;
				case 4:
					System.out.println("Exiting... Thank you!");
					sc.close();
					// Exit the program
					return;
				default:
					System.out.println("Invalid choice. Please try again.");
			}}}
}
