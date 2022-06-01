package com.syntax.class08;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {

		/*
		 * Write a program to ask a user to enter item they want to buy and the price of
		 * that item. Every time user enters money, accumulate the amount and tell the
		 * user how much is left to pay off. If user give more money program should
		 * return a change. Whenever a user done with payments program should say “Thank
		 * you for shopping!”
		 * 
		 */

		int x = 0;
		int sum = 0;
		int change = 0;
		Scanner scanner = new Scanner(System.in);
		while (x >= 0) {
			System.out.println("What item do you whant to buy?");
			String buy = scanner.nextLine();
			System.out.println("What price of this item?");
			int price = scanner.nextInt();
			scanner.nextLine();
			sum += price;
			System.out.println("Total sum is : " + sum + "$");
			System.out.println("Do you whant to continue shoping?");
			String answer = scanner.nextLine();
			if (answer.equalsIgnoreCase("Yes")) {
				x++;
			} else if (!answer.equalsIgnoreCase("Yes")) {
				System.out.println("Please enter your money");
				int money = scanner.nextInt();
				if (money >= sum) {
					change = money - sum;
				} else if (money < sum) {
					System.out.println("Money is not enough");
				}
				System.out.println("Your change is : " + change + "$");
				System.out.println("Thank you for shopping!");
				break;
			}
		}
		scanner.close();
	}

}
