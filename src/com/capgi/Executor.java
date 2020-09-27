package com.capgi;

import java.util.Scanner;

public class Executor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the address book");
		System.out.println("Enter the first name");
		String firstName = sc.nextLine();
		System.out.println("Enter the last name");
		String lastName = sc.nextLine();
		System.out.println("Enter the address");
		String address = sc.nextLine();
		System.out.println("Enter the city");
		String city = sc.nextLine();
		System.out.println("Enter the state");
		String state = sc.nextLine();
		System.out.println("Enter the zip code");
		String zip = sc.nextLine();
		System.out.println("Enter the phone number");
		String phoneNo = sc.nextLine();
		System.out.println("Enter the email");
		String email = sc.nextLine();

		AddressBook AddressBookObj = new AddressBook(firstName, lastName, address, city, state, zip, phoneNo, email);
		System.out.println(AddressBookObj.getFirstName() + " " + AddressBookObj.getLastName());
		System.out.println(AddressBookObj.getAddress() + " " + AddressBookObj.getCity() + " "
				+ AddressBookObj.getState() + " " + AddressBookObj.getZip());
		System.out.println(AddressBookObj.getPhoneNo());
		System.out.println(AddressBookObj.getEmail());
	}
}
