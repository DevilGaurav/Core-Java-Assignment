package core;

import java.time.LocalDate;


public class Customer implements Comparable<Customer>  {
	private int customerid;
	private String firstname;
	private String lastname;
	private String email;
	private String password;
	private double registrationAmount;
	private LocalDate dob;
	private ServicePlan plan;
	private static int counter=0;
	
	public Customer(String firstname,String lastname,String email,String password,double registrationAmount,LocalDate dob,ServicePlan plan){
		this.customerid=customerid;
		this.firstname=firstname;
		this.lastname=lastname;
		this.email=email;
		this.password=password;
		this.registrationAmount=registrationAmount;
		this.dob=dob;
		this.plan=plan;
		counter++;
		
	}
	
	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getRegistrationAmount() {
		return registrationAmount;
	}

	public void setRegistrationAmount(double registrationAmount) {
		this.registrationAmount = registrationAmount;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public ServicePlan getPlan() {
		return plan;
	}

	public void setPlan(ServicePlan plan) {
		this.plan = plan;
	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		Customer.counter = counter;
	}

	//tostring to return customer details
	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", firstname=" + firstname + ", lastname=" + lastname + ", email="
				+ email + ", password=" + password + ", registrationAmount=" + registrationAmount + ", dob=" + dob
				+ ", plan=" + plan + "]";
	}
	
	@Override
	public int compareTo(Customer anotherCustomer) {
		System.out.println("in compare to");
		return (this.email.compareTo(anotherCustomer.email));
			
		
	}
	
	
	public Customer(String email) {
		this.email = email;
	}

	//add 
	@Override
	public boolean equals(Object o)
	{
		System.out.println("in customer equals");
		if(o instanceof Customer) {
			Customer c=(Customer)o;
			return this.email.equals(c.email);
		}
		return false;
	}
}
