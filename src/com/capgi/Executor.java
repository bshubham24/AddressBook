package com.capgi;

import java.util.Scanner;

public class Executor {
	public static void main(String[] args) {

		int choice = 0;
		String firstName = "", lastName = "", address = "", city = "", state = "", zip = "", phoneNo = "", email = "";
		AddressBook AddressBookObj = new AddressBook(firstName, lastName, address, city, state, zip, phoneNo, email);
		while (choice != 4) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Pick an option");
			System.out.println("1. Add a contact");
			System.out.println("4. Exit");
			choice = Integer.parseInt(sc.nextLine());

			System.out.println("Welcome to the address book");
			System.out.println("Enter the first name");
			firstName = sc.nextLine();
			System.out.println("Enter the last name");
			lastName = sc.nextLine();
			System.out.println("Enter the address");
			address = sc.nextLine();
			System.out.println("Enter the city");
			city = sc.nextLine();
			System.out.println("Enter the state");
			state = sc.nextLine();
			System.out.println("Enter the zip code");
			zip = sc.nextLine();
			System.out.println("Enter the phone number");
			phoneNo = sc.nextLine();
			System.out.println("Enter the email");
			email = sc.nextLine();

			if (choice == 1) {
				AddressBookObj = new AddressBook(firstName, lastName, address, city, state, zip, phoneNo, email);
				AddressBookObj.AddContact(AddressBookObj);
				System.out.println("Pick an option");
				System.out.println("1. Add a contact");
				System.out.println("4. Exit");
				choice = Integer.parseInt(sc.nextLine());

			}
		}
		System.out.println(AddressBookObj.getFirstName() + " " + AddressBookObj.getLastName());
		System.out.println(AddressBookObj.getAddress() + " " + AddressBookObj.getCity() + " "
				+ AddressBookObj.getState() + " " + AddressBookObj.getZip());
		System.out.println(AddressBookObj.getPhoneNo());
		System.out.println(AddressBookObj.getEmail());
	}
}
