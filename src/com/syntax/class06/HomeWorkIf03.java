package com.syntax.class06;

import java.util.Scanner;

public class HomeWorkIf03 {

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
		System.out.println("Please enter operator");
		char op = scan.next().charAt(0);
		if (op == '*') {
			result = x * y;
		} else if (op == '/') {
			result = x / y;
		} else if (op == '+') {
			result = x + y;
		} else if (op == '-') {
			result = x - y;
		} else {
			System.out.println("Please enter invalid operator");
		}
		System.out.println(x + " " + op + " " + y + " = " + result);
		scan.close();
	}

}
