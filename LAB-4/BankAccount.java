// DO NOT COPY
// ITS BROKEN
import java.util.*;

public class BankAccount {
	String depositorName;
	int accountNumber;
	String accountType;
	double balance;
	static double rate;
	
	// Default Constructor
	public BankAccount() {
		System.out.println("Created new bank account");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter depositor's name: ");
		depositorName = sc.next();
		System.out.println("Enter account number: ");
		accountNumber = sc.nextInt();
		System.out.println("Enter account type: ");
		accountType = sc.next();
		System.out.println("Enter account balance: ");
		balance = sc.nextDouble();
	}
	
	// Parameterized Constructor
	public BankAccount(String name, int accNum, String accType, double accBalance, double accRate) {
		depositorName = name;
		accountNumber = accNum;
		accountType = accType;
		balance = accBalance;
		rate = accRate;
	}
	public void deposit(int amount) {
		balance += amount;
		System.out.println("Deposited Rs. " + amount);
	}
	
	public void withdraw(int amount) {
		if (balance - amount <= 0) {
			System.out.println("Insufficient balance");
		} else {
			balance -= amount;
			System.out.println("Withdrawn Rs. " + amount);
			System.out.println("Balance: Rs. " + balance);
		}
	}
	
	public void displayDetails() {
		System.out.println("Depositor's name: " + depositorName);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Account Type: "+ accountType);
		System.out.println("Account Balance: " + balance);
	}
	
	static void displayRate() {
		System.out.println("Rate of interest: " + rate);
	}
	
	public static void main(String[] args) {
		System.out.println("Demonstrating default constructor");
		BankAccount acc1 = new BankAccount();
		int choice;
		int amount;
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("Would you like to\n1. Deposit\n2. Withdraw\n3. Display Details\n4. Diplay Rate\n5. Exit");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			switch (choice) {
			
			case 1:
				System.out.println("Enter amount to deposit: ");
				amount = sc.nextInt();
				acc1.deposit(amount);
				break;
			
			case 2:
				System.out.println("Enter amount to withdraw: ");
				amount = sc.nextInt();
				acc1.withdraw(amount);
				break;
			case 3:
				acc1.displayDetails();
				break;
			case 4:
				displayRate();
				break;
			case 5:
				break;
			}
			break;
		}
		
		System.out.println();
		
		System.out.println("Demonstrating parameterized constructors");
		BankAccount acc2 = new BankAccount("Joe", 1221, "Savings", 10000, 0.5);
		while (true) {
			System.out.println("Would you like to\n1. Deposit\n2. Withdraw\n3. Display Details\n4. Diplay Rate\n5. Exit");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			switch (choice) {
			
			case 1:
				System.out.println("Enter amount to deposit: ");
				amount = sc.nextInt();
				acc2.deposit(amount);
				break;
			
			case 2:
				System.out.println("Enter amount to withdraw: ");
				amount = sc.nextInt();
				acc2.withdraw(amount);
				break;
			case 3:
				acc2.displayDetails();
				break;
			case 4:
				displayRate();
				break;
			case 5:
				break;
			}
			break;
		}
		sc.close();
	}
}
