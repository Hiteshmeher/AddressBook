package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * @author HITESH
 *
 */
public class AddressBook {
	
	Scanner sc = new Scanner(System.in);
	
	ArrayList<Contact> contactArrayList = new ArrayList<Contact>();
	
	
	
	public void addContact() {
		// creating object of Contact class
		Contact contact = new Contact();
		/**
		 * taking all details from user using scanner function
		 */
		System.out.println("Enter the First Name :");
		contact.setFirstName(sc.next());
		System.out.println("Enter the Last Name :");
		contact.setLastName(sc.next());
		System.out.println("Enter the Address :");
		contact.setAdddress(sc.next());
		System.out.println("Enter the City :");
		contact.setCity(sc.next());
		System.out.println("Enter the State :");
		contact.setState(sc.next());
		System.out.println("Enter the Zip code :");
		contact.setZipCode(sc.next());
		System.out.println("Enter the Mobile Number :");
		contact.setMobileNumber(sc.next());
		System.out.println("Enter the Email id :");
		contact.setEmail(sc.next());
		// adding contact to Array List
		contactArrayList.add(contact);
	}
	
	public void displayContact() {
		/**
		 * showing data inputed by user in addContact method
		 */	
		System.out.println("\n    Contact    ");
		System.out.println("----------------------");
		// displaying the data in the ArrayList through index value
		for(int i = 0; i < contactArrayList.size(); i++ ) {	
			Contact contact = contactArrayList.get(i);
			// Printing the contact using toString method
			System.out.println(contact.toString());
		}
	}
	
	public void editContact() {
		// editing the existing contact using their First Name
		System.out.println("Enter the First Name of Contact to Edit");
		String firstName = sc.next();
		boolean isAvailable = false ;
		for(Contact contact : contactArrayList) {
			if(contact.getFirstName().equals(firstName)) {
				isAvailable = true ;
				System.out.println("Enter the First Name :");
				contact.setFirstName(sc.next());
				System.out.println("Enter the Last Name :");
				contact.setLastName(sc.next());
				System.out.println("Enter the Address :");
				contact.setAdddress(sc.next());
				System.out.println("Enter the City :");
				contact.setCity(sc.next());
				System.out.println("Enter the State :");
				contact.setState(sc.next());
				System.out.println("Enter the Zip code :");
				contact.setZipCode(sc.next());
				System.out.println("Enter the Mobile Number :");
				contact.setMobileNumber(sc.next());
				System.out.println("Enter the Email id :");
				contact.setEmail(sc.next());
			}
		}
		if(isAvailable == false){
			System.out.println("Contact is not Available\n Try again");
		}
	}
	
	public void deleteContact() {
		// taking first name of contact to be deleted
		System.out.println("Enter the First Name of Contact to Delete");
		String firstName = sc.next();
		boolean isAvailable = false;
		for(Contact contact : contactArrayList) {
			if(contact.getFirstName().equalsIgnoreCase(firstName)) {
				// removing the contact if first name matched
				isAvailable = true ;
				contactArrayList.remove(contact);
				System.out.println("Contact deleted sucessfully");
				break;
			}
		}
		if (isAvailable == false) {
			System.out.println("Sorry ! Data not found");
		}
	}
}