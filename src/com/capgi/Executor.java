package com.capgi;

import java.util.Scanner;

public class Executor {
	public static void main(String[] args) {

		int choice = 0;
		String firstName = "", lastName = "", address = "", city = "", state = "", zip = "", phoneNo = "", email = "";
		AddressBook AddressBookObj = new AddressBook(firstName, lastName, address, city, state, zip, phoneNo, email);
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the address book");
		System.out.println("Pick an option");
		System.out.println("1. Add a contact");
		System.out.println("2. Edit an existing Contact");
		System.out.println("3. Delete an existing Contact");
		System.out.println("4. Exit");

		while (choice != 4) {
			choice = Integer.parseInt(sc.nextLine());
			if (choice == 1) {

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
				AddressBookObj = new AddressBook(firstName, lastName, address, city, state, zip, phoneNo, email);
				AddressBookObj.AddContact(AddressBookObj);
				System.out.println("Pick an option");
				System.out.println("1. Add a contact");
				System.out.println("2. Edit an existing Contact");
				System.out.println("3. Delete an existing Contact");
				System.out.println("4. Exit");

				continue;

			}
			if (choice == 2) {
				if (AddressBookObj.isNotEmpty()) {
					System.out.println("Enter the first name of person to edit contact");
					String name = sc.nextLine();
					System.out.println("Enter new details");
					System.out.println("Enter the change in lastname");
					String lname = sc.nextLine();
					System.out.println("Enter the change in address");
					String address1 = sc.nextLine();
					System.out.println("Enter the change in city");
					String city1 = sc.nextLine();
					System.out.println("Enter the change in state");
					String state1 = sc.nextLine();
					System.out.println("Enter the change in zip code");
					String zip1 = sc.nextLine();
					System.out.println("Enter the change in phone number");
					String phoneNo1 = sc.nextLine();
					System.out.println("Enter the change in email");
					String email1 = sc.nextLine();

					AddressBookObj.EditContact(name, lname, address1, city1, state1, zip1, phoneNo1, email1);

				} else
					System.out.println("Sorry, Address book is empty!");

				System.out.println("Pick an option");
				System.out.println("1. Add a contact");
				System.out.println("2. Edit an existing Contact");
				System.out.println("3. Delete an existing Contact");
				System.out.println("4. Exit");
				continue;
			}

			if (choice == 3) {
				if (AddressBookObj.isNotEmpty()) {
					System.out.println("Enter the first name of person to delete contact");
					String name = sc.nextLine();
					AddressBookObj.DeleteContact(name);

				} else
					System.out.println("Sorry, Address book is empty!");

				System.out.println("Pick an option");
				System.out.println("1. Add a contact");
				System.out.println("2. Edit an existing Contact");
				System.out.println("3. Delete an existing Contact");
				System.out.println("4. Exit");
				continue;

			}
		}
		if (AddressBookObj.isNotEmpty()) {
			System.out.println(AddressBookObj.getFirstName() + " " + AddressBookObj.getLastName());
			System.out.println(AddressBookObj.getAddress() + " " + AddressBookObj.getCity() + " "
					+ AddressBookObj.getState() + " " + AddressBookObj.getZip());
			System.out.println(AddressBookObj.getPhoneNo());
			System.out.println(AddressBookObj.getEmail());
		}
	}
}
