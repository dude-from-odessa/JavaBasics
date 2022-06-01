package com.syntax.class05;

public class LogicalAnd {

	public static void main(String[] args) {

		boolean job = true;
		double salary = 100000;

		// Logical Operators :
		/*
		 * AND && : 
		 * true && true == true 
		 * true && false == false 
		 * false && true == false 
		 * false & false == false
		 * ---------------------------------- 
		 * OR || 
		 * NOT !
		 * 
		 * 
		 */

		if (job && salary >= 100000) {
			System.out.println("I am super duper happy");

		}
		System.out.println("----------------------------------");

		boolean study = true;
		boolean homework = true;
		boolean practice = true;

		if (study && homework && practice) {
			System.out.println("You will succeed in the course");

		} else {
			System.out.println("You will struggle");
		}
		System.out.println("-----------------------------------");

		int num1 = 65;
		int num2 = 66;
		int num3 = 23;
		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + " is the largest number");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println(num2 + " is the largest number");
		} else if (num3>num1 && num3>num2) {
			System.out.println(num3 + " is the largest number");
		}

	}

}
