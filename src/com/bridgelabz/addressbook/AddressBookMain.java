package com.bridgelabz.addressbook;

/**
 * 
 * @author HITESH
 *
 */
public class AddressBookMain {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * creating object of AddressBook class
		 * calling addContact method and displayContact
		 */
		AddressBook addressBook = new AddressBook();
		addressBook.addContact();
		addressBook.displayContact();
	}
}