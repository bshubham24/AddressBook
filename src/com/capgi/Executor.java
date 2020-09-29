package com.capgi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Executor {
	public static void main(String[] args) {

		int choice = 0;
		int bookNo = 0;

		String firstName, lastName, address, city, state, zip, phoneNo, email;
		AddressBook AddressBookObj1 = new AddressBook();
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Address Book");
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
				AddressBook AddressBookObj = new AddressBook(firstName, lastName, address, city, state, zip, phoneNo,
						email);

				System.out.println("Do you want to create new address book (press 1)or add in an existing(press 2)");
				int opt = Integer.parseInt(sc.nextLine());
				if (opt == 1) {
					ArrayList<AddressBook> lstM = new ArrayList<AddressBook>();
					lstM = AddressBookObj1.AddContact(AddressBookObj);

					System.out.println("Give this address book a name using numbers in order from 1-100");
					bookNo = Integer.parseInt(sc.nextLine());
					AddressBookObj1.AddAddressBook(bookNo, lstM);
					System.out.println("Checkout avaialable address books");
					AddressBookObj1.PrintAddressBooks();
					System.out.println("Pick an option");
					System.out.println("1. Add a contact");
					System.out.println("2. Edit an existing Contact");
					System.out.println("3. Delete an existing Contact");
					System.out.println("4. Exit");

					continue;

				} else {
					System.out.println("give the name of existing address book(from 1 to 100)");
					bookNo = Integer.parseInt(sc.nextLine());
					ArrayList<AddressBook> temp = new ArrayList<AddressBook>();
					temp = AddressBookObj1.findAddressBook(bookNo);
					temp.add(AddressBookObj);
					AddressBookObj1.AddAddressBook(bookNo, temp);

					System.out.println("Checkout avaialable address books");
					AddressBookObj1.PrintAddressBooks();
					System.out.println("Pick an option");
					System.out.println("1. Add a contact");
					System.out.println("2. Edit an existing Contact");
					System.out.println("3. Delete an existing Contact");
					System.out.println("4. Exit");

					continue;
				}

			}
			if (choice == 2) {
				if (AddressBookObj1.isNotEmpty()) {
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

					AddressBookObj1.EditContact(name, lname, address1, city1, state1, zip1, phoneNo1, email1);

				} else
					System.out.println("Sorry, Address Book is empty!");

				System.out.println("Pick an option");
				System.out.println("1. Add a contact");
				System.out.println("2. Edit an existing Contact");
				System.out.println("3. Delete an existing Contact");
				System.out.println("4. Exit");
				continue;
			}

			if (choice == 3) {
				if (AddressBookObj1.isNotEmpty()) {
					System.out.println("Enter the first name of person to delete contact");
					String name = sc.nextLine();
					AddressBookObj1.DeleteContact(name);

				} else
					System.out.println("Sorry, Address Book is empty!");

				System.out.println("Pick an option");
				System.out.println("1. Add a contact");
				System.out.println("2. Edit an existing Contact");
				System.out.println("3. Delete an existing Contact");
				System.out.println("4. Exit");
				continue;

			}
		}
		HashMap<Integer, ArrayList<AddressBook>> mapItem = AddressBookObj1.getMap();
		if (mapItem.size() > 0) {
			System.out.println("Do you want to print the contacts: y/n");
			char choice1 = sc.next().charAt(0);
			if (choice1 == 'y') {
				int count = 0;

				for (Map.Entry<Integer, ArrayList<AddressBook>> item : mapItem.entrySet()) {

					count++;
					int count1 = 0;
					for (AddressBook obj : item.getValue()) {
						count1++;
						System.out.println("Contact no. : " + count + "." + count1);
						System.out.println(obj.getFirstName() + " " + obj.getLastName());
						System.out.println(
								obj.getAddress() + " " + obj.getCity() + " " + obj.getState() + " " + obj.getZip());
						System.out.println(obj.getPhoneNo());
						System.out.println(obj.getEmail());
					}
				}
			}
		}
	}
}
