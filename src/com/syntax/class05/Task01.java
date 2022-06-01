package com.syntax.class05;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		/*
		 * You are DMV representative and you need to ask customer their age. If they
		 * are 18 and older you will issue a driver license to them, otherwise you will
		 * offer them to get a learners permit.
		 *
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Please inter your age :");
		int age = scan.nextInt();
		if (age >= 18) {
			System.out.println("You will get a driver license");
		} else {
			System.out.println("You will get a learners permit");
		}
		scan.close();
	}

}
