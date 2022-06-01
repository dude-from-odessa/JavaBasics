package com.syntax.class06;

import java.util.Scanner;

public class HomeWorkIf04 {

	public static void main(String[] args) {
		/*
		 * Write a program to ask user to enter value for sale: yes or no if there is no
		 * sale --> you are not going for shopping if there is sale ask user which item
		 * they want to buy and it’s price Based on the price you have to calculate the
		 * price of the item after the discount, discount rule: if price is less than
		 * $20 --> apply 10% if price is between $20 & $100 --> 20% if price between
		 * $100 & $500 --> 30% otherwise apply 50% discount After discount ___ the price
		 * of the item reduce from __ to ___
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter value for sale : yes or no");
		String sale = scan.nextLine();
		int disc = 0;
		int price = 0;
		int value = 0;
		if (sale.equalsIgnoreCase("yes")) {
			System.out.println("What is the price for item which you want to buy?");
			price = scan.nextInt();

			if (price < 20) {
				disc = 10;
			} else if (price >= 20 && price < 100) {
				disc = 20;
			} else if (price >= 100 && price < 500) {
				disc = 30;
			} else if (price >= 500) {
				disc = 50;
			}
			value = price - (price * disc / 100);
			System.out.println("After discount " + disc + "%" + " the price of the item reduce from " + price + "$"
					+ " to " + value + "$");
		} else if (sale.equalsIgnoreCase("no")) {
			System.out.println("You are not going for shopping");
		}
		scan.close();
	}

}
