package com.syntax.class05;

import java.util.Scanner;

public class HomeWork05 {
	public static void main(String[] args) {

		/*
		 * Write a program for user to enter his/hers birth month. Based on the month
		 * define the season. Example: if user is born in March, April, May → season
		 * =“Spring” if user is born in June, July, August → season =“Summer” etc … At
		 * the end of the program we should see output as “You were born is season
		 * ______“
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your birth month");

		String m = scan.nextLine();

		if (m.equalsIgnoreCase("December") || m.equalsIgnoreCase("January") || m.equalsIgnoreCase("February")) {
			m = "Winter";
		} else if (m.equalsIgnoreCase("March") || m.equalsIgnoreCase("April") || m.equalsIgnoreCase("May")) {
			m = "Spring";
		} else if (m.equalsIgnoreCase("June") || m.equalsIgnoreCase("July") || m.equalsIgnoreCase("August")) {
			m = "Summer";
		} else if (m.equalsIgnoreCase("September") || m.equalsIgnoreCase("October") || m.equalsIgnoreCase("November")) {
			m = "Autumn";
		} else {
			System.out.println("Invalid input");
		}
		System.out.println("You were born in season " + m);
		scan.close();
	}

}
