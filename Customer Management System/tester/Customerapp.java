package tester;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import core.Customer;
import custom_ordering.CustomerDobNameComparator;
import utils.CMSUtil;
import utils.CustomerValidationRule;

public class Customerapp {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// init phase
			boolean exit = false;
			// init D.S
			List<Customer> customerList = CMSUtil.populateCustomer();// size 0,init cap10
			while (!exit) {
				System.out.println("options 1:customer signup 2:display all 3:Authinticate Customer "
						+ "4:change password 5:delete user 6:customer detail sorted as per email"
						+ "7:customer details sorted as per dob and lastname  0:exit");
				System.out.println("choose");
				try {
					switch(sc.nextInt()) {
					case 1:// register new customer
						System.out.println("Enter customer details :   firstName,  lastName,  email,  password,	regAmount,  dob,  plan");
						Customer customer = CustomerValidationRule.validateCustomerInputs(sc.next(), sc.next(), sc.next(), sc.next(),sc.nextDouble(), sc.next(), sc.next(), customerList);
						//=> all i/ps are valid
						customerList.add(customer);
						System.out.println("customer registered....");
						break;
					case 2://display all
						for(Customer c:customerList)
							System.out.println(c);
						break;
					case 3://login
						System.out.println("enter email and password ");
						customer  = CMSUtil.authenticationCustomer(sc.next(),sc.next(), customerList);
						System.out.println("Successful login ,your details"+customerList);
					case 4: // chage password
						System.out.println(" enter email n old pass n new pass");
						customer =CMSUtil.authenticationCustomer(sc.next(), sc.next() , customerList);
						customer.setPassword(sc.next());
						System.out.println("password is changed");
					case 5://delete user
						System.out.println("enter email to unsubscribe");
						CMSUtil.deleteCustomer(sc.next(), customerList);
						break;
					case 6://Display customer details sorted as per the email (asc) : using natural ordering
						Collections.sort(customerList);
						break;
					case 7://customer details sorted as per dob and lastname
						Collections.sort(customerList ,new CustomerDobNameComparator());
						break;
					case 8://customer details sorted as per dob and lastname using anonymous inner class
						Collections.sort(customerList ,new Comparator<Customer>() {
							@Override
							public int compare(Customer o1,Customer o2) {
								int dobcompare=o1.getDob().compareTo(o2.getDob());
								if (dobcompare!=0) {
									return dobcompare;
								}return (o1.getLastname().compareTo(o2.getLastname())) ;
							}
						});
						break;
					
					case 9://validate password
						System.out.println("enter password to validate");
						CustomerValidationRule.validatecustinputs(sc.next());
						System.out.println("password set");
						break;
						
						
						
					case 0:
						exit =true;
						break;
					}
				}catch (Exception e) {
					sc.nextLine();
					System.out.println(e);// toString
			}
				
		}
		}
	}
}
