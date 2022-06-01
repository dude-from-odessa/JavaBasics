package com.syntax.class04;

public class Donor {

	/*
	 * 2. Create a Java program and call it a Donor.
	 * 
	 * In order to be eligible to donate your blood you have to be 18 years old.
	 * Also once you identify age eligibility then we have to see if person matches
	 * weight requirements. If person weight it more than 110 lbs → then he/she is
	 * eligible, otherwise we cannot accep such a patient.
	 */

	public static void main(String[] args) {
		int age = 17;
		int weight = 110;

		if (age >= 18) {
			if (weight >= 110) {
				System.out.println("You are " + age + " years old, and your weight is " + weight + " lbs.");
				System.out.println("You are eligible to be a donor.");
			} else {
				System.out.println(
						"You are " + age + " years old, and your weight is " + weight + " lbs. It is less then 110 lbs.");
				System.out.println("You are not eligible to be a donor.");
			}
		} else {
			System.out.println("You are " + age + " years old, and your weight is " + weight + " lbs.");
			System.out.println("You are not eligible to be a donor. You are younger than 18 years old.");
		}
	}
}
