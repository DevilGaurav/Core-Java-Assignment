package custom_ordering;

import java.util.Comparator;

import core.Customer;

public class CustomerDobNameComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		System.out.println("in compare dob n lastname");
		int retvel=(o1.getDob().compareTo(o2.getDob()));
		if (retvel==0) {
				return (o1.getLastname().compareTo(o2.getLastname()));
		}
		return 1;
	}

}
