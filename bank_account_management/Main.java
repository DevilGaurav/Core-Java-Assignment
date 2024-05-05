package bank_account_management;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		BankAccount[] accounts = new BankAccount[10]; // Array to store up to 10 bank accounts

	Scanner scanner = new Scanner(System.in);
	boolean exit = false;
	while (!exit) {
		System.out.println("Choose an option:");
		System.out.println("1. Add Account");
		System.out.println("2. Deposit Money");
		System.out.println("3. Withdraw Money");
		System.out.println("4. Display All Accounts");
		System.out.println("5. Exit");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
		// Implementation to add an account
			BankArrayUtility.createaccount(accounts);
		break;
		case 2:
		// Implementation to deposit money
			BankArrayUtility.depositMoney(accounts);
		break;
		case 3:
		// Implementation to withdraw money
			BankArrayUtility.withdrawmoney(accounts);
		break;
		case 4:
		// Implementation to display all accounts
			BankArrayUtility.display(accounts);
		break;
		case 5:
			exit = true;
			break;
		default:
		System.out.println("Invalid option. Please try again.");
		}
		}
		scanner.close();
}
}