package com.activity.one;

import java.util.*;
import com.activity.one.util.ClassC;

public class MainClass {
	public static void main(String[] args) {
		if(ClassA.bool) {
			System.out.println("True");
		} else {
			System.out.println("False");

		}

		outputA();
		outputB();
		outputC();
	}

	public static void outputA() {
		System.out.println("Class A: "+ ClassA.bool);
	}

	public static void outputB() {
		String[] days = ClassB.days;
		for(int i=0; i<days.length; i++){
			System.out.println("Class B: "+ days[i]);
		}
	}

	public static int outputC() {
		int result = ClassC.printValue(1);
		return result;
	}
}