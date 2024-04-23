package com.activity.two;

import java.util.*;

public class Smartphone extends Telephone {
	private String phoneNo;
	private String operatingSystem;
	Map<String, String> contacts = new HashMap<>();

	public Smartphone(String phoneNo, String operatingSystem) {
		this.phoneNo = phoneNo;
		this.operatingSystem = operatingSystem;
	}

	public String getPhoneNo() {
		return this.phoneNo;
	}

	public String getOperatingSystem() {
		return this.operatingSystem;
	}

	public void addContact(String name, String phoneNo) {
		if(contacts.containsKey(name)) {
			System.out.println("Add Contact: Contact " +name+ " already exists");
		}
		this.contacts.put(name, phoneNo);
		System.out.println("Add Contact: Contact " +name+ " successfully added");
	}

	public void removeContact(String name) {
		if(!contacts.containsKey(name)) {
			System.out.println("Remove Contact: Contact " +name+ " does not exist");
		}
		this.contacts.remove(name);
		System.out.println("Remove Contact: Contact " +name+ " successfully removed");
	}

	@Override
	public void call(String phoneNo) {
		if(this.phoneNo.equals(phoneNo)) {
			System.out.println("You can't call yourself");
		}else {
			super.call(phoneNo);
		}
	}

	public void call(String name, String phoneNo) {
		if(this.contacts.containsKey(name)) {
			System.out.println("Calling from contacts");
		} else {
			this.call(phoneNo);
		}
	}

	public void displayContacts() {
		System.out.println("------- C O N T A C T S -------");
		for (Map.Entry entry : this.contacts.entrySet()) {
			System.out.println(entry.getKey()+": "+entry.getValue());
		}
		System.out.println("-------------------------------\n");
	}
}