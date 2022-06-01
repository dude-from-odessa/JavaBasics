package com.syntax.class04;

public class IfElseIf {

	public static void main(String[] args) {

		/*
		 * declare 2 numbers and verify which one is the largest only 1 block will be
		 * executed when you are using else. When Java will find true condition it will not go
		 * to another block.
		 * the moment Java finds true condition -> it executes that block exist
		 * entire if statement.
		 * Else block is always optional
		 */

		int num1 = 67;
		int num2 = 67;

		if (num1 > num2) {
			System.out.println(num1 + " is the larger than " + num2);
		} else if (num2 > num1) {
			System.out.println(num1 + " is the larger than " + num2);
		} else {
			System.out.println(num1 + " is equal to " + num2);
		}
		System.out.println("-----------------------------------------");
		
		int day = 8;
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
