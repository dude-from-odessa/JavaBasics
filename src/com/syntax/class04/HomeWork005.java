package com.syntax.class04;

import java.util.Scanner;

public class HomeWork005 {

	public static void main(String[] args) {

		/*
		 * Create a java program in which using Scanner you are going to capture 2
		 * numbers. And once you capture 2 numbers, please check which one is the
		 * largest.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("Please type X number : ");
		int x = scan.nextInt();
		System.out.print("Please type Y number : ");
		int y = scan.nextInt();

		if (x > y) {
			System.out.println("Number X = " + x + " is larger than number Y = " + y);
		} else if (y > x) {
			System.out.println("Number Y = " + y + " is larger than number X = " + x);
		} else if (x == y) {
			System.out.println("Number X = " + x + " is equal to number Y = " + y);
		}
		scan.close();
	}
}
