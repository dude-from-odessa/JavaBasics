package com.syntax.class05;

import java.util.Scanner;

public class Task003 {

	public static void main(String[] args) {

		/*
		 * Prompt the user to enter person heights in inches. Person should be
		 * classified as one of the following: short (under 60 inch) medium(between 60
		 * -72 inch) tall (over 72 inch)
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your height in inches");
		int h = scan.nextInt();
		if (h < 60) {
			System.out.println("You have short height");
		} else if (h >= 60 && h <= 72) {
			System.out.println("You have medium height");
		} else if (h > 72) {
			System.out.println("You have tall height");
		}
		scan.close();

	}

}
