package com.syntax.review02;

import java.util.Scanner;

public class IfElseDemo3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter your Account balance");
		double accountBalance = scanner.nextDouble();
		System.out.println("Please enter the amount that you want to lend to your friend");
		double amountToLend = scanner.nextDouble();
		if (accountBalance >= amountToLend) {
			System.out.println("Yes i can help you");
		} else {
			System.out.println("Sorry i don't have enough money to help you");

		}
		scanner.close();
	}

}
