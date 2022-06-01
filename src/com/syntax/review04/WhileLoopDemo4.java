package com.syntax.review04;

import java.util.Scanner;

public class WhileLoopDemo4 {

	public static void main(String[] args) {

		// take the input form the user using scanner
		// increment it by 2 print it
		// if value is 10 terminate the program

		Scanner scanner = new Scanner(System.in);

		int x = 0;

		while (x != 10) {

			System.out.println("Please enter the number");

			x = scanner.nextInt();

			System.out.println(x + 2);
		}
         scanner.close();
	}

}
