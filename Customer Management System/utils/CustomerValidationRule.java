package utils;

import java.time.LocalDate;
import java.util.List;

import core.Customer;
import core.ServicePlan;
import custom_exception.CustomerException;

public class CustomerValidationRule {
	// add method to check for dup customer (by email)
	public static void checkfordupcustomer(String email, List<Customer> customerList) throws CustomerException {

		// 1.create customer class instance wrapping pk
		Customer newCust = new Customer(email);

		// invoke contains using customer ref.
		// list :{c1,c2,c3,c4,c5,...}with emails:a1@gmail.com.....,a5@gmail.com
		if (customerList.contains(newCust))
			throw new CustomerException("Dup email is");
	}

	// add method to parse n validate plan n its charges
	public static ServicePlan parseAndValidePlanAndCharges(String plan, double regAmount) throws CustomerException {
		// parse string(plan) -->enum

		ServicePlan serviceplan = ServicePlan.valueOf(plan.toUpperCase());

		// => plan is valid ,now chk if reg amount is correct
		if (serviceplan.getPlanCost() == regAmount)
			return serviceplan;

		// =>incorrefct reg amount :throw custom exc
		throw new CustomerException("reg amount doesnt match with choosen");
	}

	// add a method to validate all inputs
	public static Customer validateCustomerInputs(String firstname, String lastname, String email, String password,
			double registrationAmount, String dob, String plan, List<Customer> customers) throws CustomerException {
		// 1.check for dup
		checkfordupcustomer(email, customers);
		ServicePlan serviceplan = parseAndValidePlanAndCharges(plan, registrationAmount);
		LocalDate bdate = LocalDate.parse(dob);
		validatecustinputs(password);
	//	LocalDate birthdate = parseandvalidatedob(dob);
		return new Customer(firstname, lastname, email, password, registrationAmount, bdate, serviceplan);

	}

	public static String validatecustinputs(String password) throws CustomerException {
		String regex = "((?=.*\\d)(?=.*[a-z])(?=.*[#@$*]).{5,20})";
		if (!password.matches(regex))
			throw new CustomerException("Invalid password");
		return password;
	}
	/*
	 * public static LocalDate parseandvalidatedob(String dob)throws
	 * CustomerException { LocalDate date=LocalDate.parse(dob); int
	 * age=Period.between((, date) }
	 */
}
