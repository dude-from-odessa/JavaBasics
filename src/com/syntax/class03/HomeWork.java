package com.syntax.class03;

public class HomeWork {

	public static void main(String[] args) {

		/*
		 * Create Java program to store 2 values for expected and actual hours. Your
		 * program should check if expected hours are more than actual the program
		 * should print “You will love the course and you will succeed”, otherwise
		 * “Course will be very hard for you!“.
		 */

		int expected = 10, actual = 5;

		if (expected > actual) {
			System.out.println("You will love the course and you will succeed");

		} else {
			System.out.println("Cource will be very hard for you!");

		}

		String g = "Boom";

		if (g.equals("boom")) {
			System.out.println("Wow");
		} else {
			System.out.println("Whoop");

		}

		String good = "Bad";

		if (good.equals("Bad")) {
			System.out.println("Evil");
		}

		else {
			System.out.println("Peace");

		}

		int day = 3;
		if (day == 1) {
			System.out.println("Monday");
		} else if (day == 2) {
			System.out.println("Tuesday");
		} else if (day == 3) {
			System.out.println("Wednesday");
		} else if (day == 4) {
			System.out.println("Thursday");
		} else if (day == 5) {
			System.out.println("Friday");
		} else if (day == 6) {
			System.out.println("Saturday");
		} else if (day == 7) {
			System.out.println("Sunday");
		}
		
		
	}
}
