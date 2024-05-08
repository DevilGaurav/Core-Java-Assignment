package com.developer.tester;

import java.time.LocalDate;
import java.util.HashSet;

import com.developer.core.Contact;

public class PBMapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creation of hashset in memory
		HashSet<Contact> list= new HashSet<>();
		Contact c1= new Contact(12345,"gaurav",LocalDate.of(2001,06,11),"gaurav");
		Contact c2= new Contact(12345,"gaurav",LocalDate.of(2001,06,11),"gaurav");
		Contact c3= new Contact(12345,"madhura",LocalDate.of(2001,06,11),"madhura");
		Contact c4= new Contact(12345,"madhura",LocalDate.of(2001,07,15),"madhura");
		Contact c5= new Contact(12345,"sneha",LocalDate.of(1998,8,01),"sneha");
		
		System.out.println("added "+list.add(c1));
		System.out.println("added "+list.add(c2));
		System.out.println("added "+list.add(c3));
		System.out.println("added "+list.add(c4));
		System.out.println("added "+list.add(c5));
	
		
		
	}

}
