package com.activity.two.app;

import java.util.*;
import com.activity.two.*;
import java.lang.Object;

public class SeatworkTwo {
	public static void main (String[] args) {
		Telephone telephone = new Telephone();
		telephone.call(randomizePhoneNo());

		Smartphone smartphone = new Smartphone(randomizePhoneNo(), "Android");
		System.out.println("Smartphone Number: "+smartphone.getPhoneNo());
		System.out.println("Smartphone OS: "+smartphone.getOperatingSystem());

		String savedNumber = "";
		String savedName = "";
		for(int i=0; i<5; i++) {
			String randomNumber = randomizePhoneNo();
			String randomName = randomizeName();
			smartphone.addContact(randomName, randomNumber);

			if(i == 0){
				savedName = randomName;
			}else if(i == 1) {
				savedNumber = randomNumber;
			}
		}

		smartphone.displayContacts();

		smartphone.removeContact(savedName);
		smartphone.call(randomizePhoneNo());
		smartphone.call(savedNumber);

	}

	public static String randomizePhoneNo() {
		Random random = new Random();

		String phoneNo = "";
		for(int i=0; i<11; i++) {
			phoneNo += random.nextInt(10);
		}

		return phoneNo;
	}

	public static String randomizeName() {
		Random random = new Random();

		String name = "";
		for(int i=0; i<7; i++){
			name += (char) (random.nextInt(26) + 65);
		}
		return name;
	}
}