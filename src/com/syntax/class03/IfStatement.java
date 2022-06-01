package com.syntax.class03;

public class IfStatement {

	public static void main(String[] args) {

		/*
		 * declare a varible rate. If rate is more than 5 --> I am not buying a house.
		 */

		double mortgageRate = 5.5;

		if (mortgageRate > 5) {

			System.out.println("I am not buying a house");

		}

		/*
		 * declare 2 variables and check if num1 is bigger than num2
		 */

		int num1 = 99;
		int num2 = 10;

		if (num1 > num2) {
			System.out.println(num1 + " is bigger than " + num2);

		}

		/*
		 * declare temperature, if temp is higher than 75 -> i will go a walk
		 */
		int temp = 85;

		if (temp > 75) {
			System.out.println("I will go for a walk"); // inside if there is boolean value. condition is true will
														// inter to another block
		} else {
			System.out.println("I am going to study Java"); // otherwise. Code comes to else {}. When condition is false
		}

		// if (true condition) {code;}

		// if (true condition) {code A;} else {Code B;}

		char gender = 'm';

		if (gender == 'f') {
			System.out.println("You like shopping");
		} else {
			System.out.println("You like watching sports");

		}

		System.out.println("---------------------------");

		String browser = "chrome";

		if (browser.equals("chrome")) {
			System.out.println("All test cases will be executed on chrome");
		} else {
			System.out.println("I am not executing any test cases");
		}

		/*
		 * when your code has no errors always try to format it
		 * mac cmd+shift+f 
		 * windows ctr+shift+f
		 */
		
		
	}
	
	
	

}
