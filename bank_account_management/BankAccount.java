package bank_account_management;

public class BankAccount {
	private int accountid;
	private String accountHolder;
	private double balance;
	private static int counter=0;
	
	

	public BankAccount(int accountid, String accountHolder, double balance) {
		this.accountid = accountid;
		this.accountHolder = accountHolder;
		this.balance = balance;
		counter++;
	}

	public static int getCounter() {
		return counter;
	}

	public int getAccountid() {
		return accountid;
	}

	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amt) {
		this.balance += amt;
		System.out.println("amount is deposited " + balance);

	}

	public void withdraw(double amt) {
		this.balance -= amt;
		System.out.println("amount is withdrawed " + balance);
	}
	public void displayBankaccountDetails(){
		System.out.println("Accoun ID :" +this.accountid );
		System.out.println("Account holder name :" +this.accountHolder );
		System.out.println("Accoun balance :" +this.balance );
	  
	}

}
