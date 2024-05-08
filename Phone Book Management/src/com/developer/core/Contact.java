package com.developer.core;

import java.time.LocalDate;

public class Contact {
	private int number;
	private String name;
	private LocalDate dob;
	private String email;
	
	public Contact(int number,String name,LocalDate dob,String email) {
		this.number=number;
		this.name=name;
		this.dob=dob;
		this.email=email;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contact [number=" + number +
				", name=" + name +
				", dob=" + dob +
				", email=" + email + "]";
	}
	//we do this wrap method only when we want to use pk
//	public Contact(String email.dob) {
//		this.email=email;
//		this.dob=dob;
//	}
	
	@Override //override equal method to replace ref equality by pk equality
	//method to create pk
	public boolean equals(Object o) {
		if (o instanceof Contact) {
			Contact c=(Contact)o;
			return this.email.equals(c.email) && this.dob.equals(c.dob);
		}return false;
	}
	@Override
	public int hashCode()
	{
		System.out.println("in hashcode");
		return dob.hashCode()+email.hashCode();
	}


}
