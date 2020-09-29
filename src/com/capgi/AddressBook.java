package com.capgi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AddressBook {
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phoneNo;
	private String email;

	public AddressBook() {

	}

	public AddressBook(String firstName, String lastName, String address, String city, String state, String zip,
			String phoneNo, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNo = phoneNo;
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	ArrayList<AddressBook> lst = new ArrayList<AddressBook>();

	public ArrayList<AddressBook> AddContact(AddressBook obj) {
		lst.add(obj);
		System.out.println("Contact Added");
		return lst;
	}

	public boolean isNotEmpty() {
		if (lst.size() != 0) {
			return true;
		} else
			return false;
	}

	public void EditContact(String name, String lName, String address1, String city1, String state1, String zip1,
			String phoneNo1, String email1) {
		for (AddressBook item : lst) {
			if (item.getFirstName().equals(name)) {
				item.setLastName(lName);
				item.setAddress(address1);
				item.setCity(city1);
				item.setState(state1);
				item.setZip(zip1);
				item.setPhoneNo(phoneNo1);
				item.setEmail(email1);

				System.out.println("Contact successfully edited");
				break;

			} else
				System.out.println("Person Not found!");

		}
	}

	public void DeleteContact(String name) {
		for (AddressBook item : lst) {
			if (item.getFirstName().equals(name)) {
				lst.remove(item);
				System.out.println("Contact deleted!");
				break;
			}
		}
	}

	HashMap<Integer, ArrayList<AddressBook>> mapElement = new HashMap<Integer, ArrayList<AddressBook>>();

	public void PrintAddressBooks() {
		System.out.println("Following Address books available");
		for (Map.Entry<Integer, ArrayList<AddressBook>> item : mapElement.entrySet()) {

			System.out.println(item.getKey());

		}
	}

	public void AddAddressBook(int no, ArrayList<AddressBook> lstt) {

		mapElement.put(no, lstt);

	}

	public ArrayList<AddressBook> findAddressBook(int bookNo) {
		ArrayList<AddressBook> temp = new ArrayList<AddressBook>();
		for (Map.Entry<Integer, ArrayList<AddressBook>> item : mapElement.entrySet()) {
			if (item.getKey() == bookNo) {
				System.out.println("book is present. Adding");
				temp = (ArrayList<AddressBook>) item.getValue();
				break;

			} else {
				System.out.println("Wrong name or address book is not present");
				break;

			}
		}
		return temp;
	}

	public HashMap<Integer, ArrayList<AddressBook>> getMap() {
		return mapElement;
	}
}
