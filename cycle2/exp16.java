import java.util.ArrayList;
import java.util.Scanner;

class BankAccount {
	    private int accountNumber;
	    private double balance;

	    public BankAccount(int accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	    }

	    public int getAccountNumber() {
		return accountNumber;
	    }

	    public double getBalance() {
		return balance;
	    }
	}

	class Bank {
	    private String bankName;
	    private ArrayList<BankAccount> accounts;

	    public Bank(String bankName) {
		this.bankName = bankName;
		this.accounts = new ArrayList<>();
	    }

	    public void addAccount(int accountNumber, double balance) {
		BankAccount account = new BankAccount(accountNumber, balance);
		accounts.add(account);
		System.out.println("Account added successfully.");
	    }

	    public void removeAccount(int accountNumber) {
		for (int i = 0; i < accounts.size(); i++) {
		    if (accounts.get(i).getAccountNumber() == accountNumber) {
		        accounts.remove(i);
		        System.out.println("Account removed successfully.");
		        return;
		    }
		}
		System.out.println("Account not found.");
	    }

	    public void displayAccounts() {
		System.out.println("Bank Accounts:");
		for (BankAccount account : accounts) {
		    System.out.println("Account Number: " + account.getAccountNumber() + ", Balance: " + account.getBalance());
		}
	    }
	}

	public class exp16 {
	    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Bank bank = new Bank("MyBank");

		while (true) {
		    System.out.println("\nMenu:");
		    System.out.println("1. Add Account");
		    System.out.println("2. Remove Account");
		    System.out.println("3. Display Accounts");
		    System.out.println("4. Exit");
		    System.out.print("Enter your choice: ");
		    int choice = scanner.nextInt();

		    switch (choice) {
		        case 1:
		            System.out.print("Enter account number: ");
		            int accNum = scanner.nextInt();
		            System.out.print("Enter initial balance: ");
		            double balance = scanner.nextDouble();
		            bank.addAccount(accNum, balance);
		            break;
		        case 2:
		            System.out.print("Enter account number to remove: ");
		            int accToRemove = scanner.nextInt();
		            bank.removeAccount(accToRemove);
		            break;
		        case 3:
		            bank.displayAccounts();
		            break;
		        case 4:
		            System.out.println("Exiting program.");
		            System.exit(0);
		            break;
		        default:
		            System.out.println("Invalid choice. Please enter again.");
		    }
		}
	    }
	}



