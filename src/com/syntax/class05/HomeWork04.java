package com.syntax.class05;

import java.util.Scanner;

public class HomeWork04 {

	public static void main(String[] args) {

		/*
		 * Write a program that will ask user to input inputs the current time (use 24
		 * hour format). Based on the given time define:
		 * 
		 * if hour is between 1-11 --> Morning if hour between 12-15 --> Afternoon if
		 * hour between 16-20 --> Evening if hour between 21-24 --> Night
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the current time in 24 hours format");
		int t = scan.nextInt();
		if (t >= 1 && t <= 11) {
			System.out.println("It's Morning now");
		} else if (t >= 12 && t <= 15) {
			System.out.println("It's Afternoon now");
		} else if (t >= 15 && t <= 20) {
			System.out.println("It's Evening now");
		} else if (t >= 21 && t <= 24) {
			System.out.println("It's Nignt");
		}
		scan.close();

	}

}
