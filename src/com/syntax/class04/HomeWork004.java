package com.syntax.class04;

import java.util.Scanner;

public class HomeWork004 {

	public static void main(String[] args) {

		/*
		 * Create a java program in which using Scanner you are going to capture user’s
		 * first name, last name and state where he/she lives.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("What is your first name?");
		String fn = scan.nextLine();
		System.out.println("What is your last name?");
		String ln = scan.nextLine();
		System.out.println("What state are you living?");
		String st = scan.nextLine();
		System.out.println("You are " + fn + " " + ln + " and you are living in " + st + " state.");
		scan.close();
	}

}
