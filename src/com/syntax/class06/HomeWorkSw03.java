package com.syntax.class06;

import java.util.Scanner;

public class HomeWorkSw03 {

	public static void main(String[] args) {

		/*
		 * * HW: Using scanner class create calculator. Allow user to enter 2 numbers
		 * and operator(+,-,*,/). Based on operator provide the result to user. Please
		 * complete this assignment in 2 ways: using if statement and switch case.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter two numbers");
		double x = scan.nextInt();
		double y = scan.nextInt();
		double result = 0;
		String operator = "null";
		System.out.println("Please enter operator");
		char op = scan.next().charAt(0);
		switch (op) {

		case '*':
			result = x * y;
			break;
		case '/':
			result = x / y;
			break;
		case '+':
			result = x + y;
			break;
		case '-':
			result = x - y;
			break;
		default:
			System.out.println("Invalid Operator");
			operator = "Invalid";

		}
		if (!operator.equals("Invalid")) {
			System.out.println(x + " " + op + " " + y + " = " + result);
		}
		scan.close();
	}

}
