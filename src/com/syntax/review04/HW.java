package com.syntax.review04;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {

		double accumulatedAmount = 0;
		Scanner input = new Scanner(System.in);
		double amountToPayOff;
		do {
			System.out.println("Enter the item name that you whant to buy");
			String itemName = input.next();
			System.out.println("Enter the price of item");
			double itemPrice = input.nextDouble();
			accumulatedAmount = accumulatedAmount + itemPrice;
			System.out.println("Please Enter the money");
			double money = input.nextDouble();
			amountToPayOff = money - accumulatedAmount;
			if (amountToPayOff < 0) {
				System.out.println("Amount to pay off " + (-1 * amountToPayOff));
			}
		} while (amountToPayOff < 0);
		System.out.println("Here is your change " + amountToPayOff + " Thank you for shopping!");

	}

}
