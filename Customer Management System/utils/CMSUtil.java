package utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import core.Customer;
import core.ServicePlan;
import custom_exception.CustomerException;

public class CMSUtil {

	public static Customer authenticationCustomer(String email, String password, List<Customer> list)
			throws CustomerException {
		// TODO Auto-generated method stub
		// indexof
		// invalid email:throw exc
		// get -- Customer ref --chk pwd ---invalid --throw custom exc

		Customer newCustomer = new Customer(email);
		int index = list.indexOf(newCustomer);// O(n)
		if (index == -1)
			throw new CustomerException("invalid email");
		Customer customer = list.get(index);
		if (customer.getPassword().equals(password))
			;
		return customer;
	}

	public static String deleteCustomer(String email, List<Customer> list) throws CustomerException {
		Customer newCustomer = new Customer(email);
		int index = list.indexOf(newCustomer);
		if (index == -1)
			throw new CustomerException("invalis email");
		return "remove details" + list.remove(index).getFirstname();
	}

	public static List<Customer> populateCustomer(){
		Customer a1=new Customer ("Gaurav","Awati","gau","111",2000,LocalDate.of(2021,11,11),ServicePlan.GOLD);
		Customer a2=new Customer ("Madhura","danke","mad","112",10000,LocalDate.of(2022,11,12),ServicePlan.PLATINUM);
		Customer a3=new Customer ("Sneha","Agrawar","sne","113",5000,LocalDate.of(2020,11,13),ServicePlan.DIAMOND);
		Customer a4=new Customer ("salman","kaji","sal","114",1000,LocalDate.of(2015,03,23),ServicePlan.SILVER);
		Customer a5=new Customer ("shailesh","kale","sha","115",2000,LocalDate.of(2016,05,05),ServicePlan.GOLD);
		Customer a6=new Customer ("Dnyanesh","choudhary","dny","116",5000,LocalDate.of(2016,06,06),ServicePlan.DIAMOND);
		Customer a7=new Customer ("Vaishnavi","bhondve","vai","117",10000,LocalDate.of(2016,06,06),ServicePlan.PLATINUM);
		Customer a8=new Customer ("Anushka","jain","anu","118",5000,LocalDate.of(2016,6,06),ServicePlan.DIAMOND);
		Customer a9=new Customer ("prathemesh","dargude","pra","119",2000,LocalDate.of(2016,6,06),ServicePlan.GOLD);
		Customer[] cust={a1,a2,a3,a4,a5,a6,a7,a8,a9};
		ArrayList<Customer> customerList= new ArrayList<Customer>();
		for (Customer a:cust)
			customerList.add(a);
		return customerList;
	}
}
