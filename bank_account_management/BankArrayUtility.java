package bank_account_management;

import java.util.Scanner;

public class BankArrayUtility {
	public static int count=0;
	public static void createaccount(BankAccount[] arr) {
		Scanner in=new Scanner(System.in);
			System.out.println("Enter account id ");
			int id=in.nextInt();
			System.out.println("Enter account holder name ");
			String nm=in.next();
			System.out.println("Enter balance ");
			double bl=in.nextDouble();
			if (BankAccount.getCounter()<arr.length) {
				arr[BankAccount.getCounter()]= new BankAccount(id,nm,bl);
				count++;
			}else {System.out.println("Account capacity reached ");
			}
		}	
		public static void depositMoney(BankAccount[] arr)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter acc id ");
			int accountid=sc.nextInt();
			for(int i=0;i<count;i++) {
				if(accountid==arr[i].getAccountid())
				{
					System.out.println("enter amount to deposit");
					double deposit=sc.nextDouble();
					arr[i].deposit(deposit);
					break;
				}
				else {
					System.out.println("no customer found ");
				}
			}
	}
		public static void withdrawmoney(BankAccount[] arr) {
			Scanner ab=new Scanner(System.in);
			System.out.println("enter acc id");
			int accountid=ab.nextInt();
			for (int i=0;i<count;i++) {
				if(accountid==arr[i].getAccountid()) {
					System.out.println("enter amount to withdraw ");
					double withdraw=ab.nextDouble();
					arr[i].withdraw(withdraw);
					break;
				}
				else {
					System.out.println("no customer found");
				}
			}
		}
		public static void display(BankAccount[] arr) {
			Scanner db=new Scanner(System.in);
			System.out.println("enter account id ");
			int accountid=db.nextInt();
			for (int i=0;i<count;i++) {
				if(accountid==arr[i].getAccountid()) {
					arr[i].displayBankaccountDetails();
				}
			}
		}
}
