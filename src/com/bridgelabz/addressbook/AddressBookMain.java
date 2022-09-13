package com.bridgelabz.addressbook;

/**
 * 
 * @author HITESH
 *
 */
public class AddressBookMain extends Operations {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to the Address book System project: ");
		Operations operations = new Operations();
		System.out.println("--------------------------Address Book-------------------------");
		AddressBook(operations);
	}
}