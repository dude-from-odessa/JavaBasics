package com.syntax.class06;

import java.util.Scanner;

public class HomeWorkIf01 {

	public static void main(String[] args) {

		/*
		 * Ask user to enter their country and capture it. Once values are captured
		 * print which language user speaks.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your country");
		String country = scan.nextLine();
		if (country.equalsIgnoreCase("Ukraine")) {
			System.out.println("Your speaking Ukrainian language");
		} else if (country.equalsIgnoreCase("Bulgaria")) {
			System.out.println("Your speaking Bulgarian language");
		} else if (country.equalsIgnoreCase("USA")) {
			System.out.println("Your speaking English language");
		} else if (country.equalsIgnoreCase("Finland")) {
			System.out.println("Your speaking Finnish language");
		} else if (country.equalsIgnoreCase("Norway")) {
			System.out.println("Your speaking Nynorsk Norwegian language");
		} else if (country.equalsIgnoreCase("Japan")) {
			System.out.println("Your speaking Japanese language");
		} else if (country.equalsIgnoreCase("Sweden")) {
			System.out.println("Your speaking Swedish language");
		} else if (country.equalsIgnoreCase("Romania")) {
			System.out.println("Your speaking Romanian language");
		} else {
			System.out.println("Unknown input");
		}
		scan.close();
	}

}
