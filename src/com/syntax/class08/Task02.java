package com.syntax.class08;
import java.util.Scanner;
public class Task02 {

	public static void main(String[] args) {
		
		
		/*
		 * Print numbers from 1 to 50 except those that are divisible by 3
		 * 
		 * Create a program that will keep asking user to apply for a credit card. 
		 * As soon you get “yes” from a user program should stop asking.
		 */
		
		for ( int x = 1; x<=50; x++) {
			if(x%3!=0) {
	
			System.out.print(x+" ");}
		}
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Will you apply for a credit card?");
		String user = scanner.nextLine();
		while (!user.equalsIgnoreCase("yes")) {
			System.out.println("Will you apply for a credit card?");
			user = scanner.nextLine();
		}
		scanner.close();

	}

}
