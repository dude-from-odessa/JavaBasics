package com.syntax.class05;

import java.util.Scanner;

public class Task004 {

	public static void main(String[] args) {
		/*
		 * Write a program that will print whether it is a weekend or weekday. If any
		 * day from 1-5 → output “It is a weekday”, anyday from 6-7 → output “It is a
		 * weekend”, any other day → output “Invalid day”
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter what is the day of week today?");
		int d = scan.nextInt();

		if (d == 1 || d == 2 || d == 3 || d == 3 || d == 4 || d == 5) {
			System.out.println("It is a weekday");
		} else if (d >= 6 && d <= 7) {
			System.out.println("It is weekend");
		} else {
			System.out.println("Invalid day");
		}
		scan.close();

	}

}
