package com.syntax.class08;
import java.util.Scanner;
public class LoopsPractice {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i < 6; i++) {

			System.out.println(sum + " "); // 0 1 3 6 10

			sum += i;
			//
		}
		System.out.println("Value of sum =");
		System.out.println(sum); // 15

		/*
		 * write a program to find sum of all even and all odd numbers from 1 to 70
		 */
		int odd = 0;
		int even = 0;
		int all;
		for (int i = 0; i <= 70; i += 2) {
			odd += i;
		}
		System.out.println(odd);
		for (int i = 1; i <= 70; i += 2) {
			even += i;
		}
		System.out.println(even);
		all = odd + even;
		System.out.println(all);

		// Another way

		int sumEven = 0;
		int sumOdd = 0;

		for (int i = 1; i <= 70; i++) {
			if (i % 2 == 0) {
				sumEven += i;
			} else {
				sumOdd += i;
			}
		}
		System.out.println("Sum even numbers is " + sumEven);
		System.out.println("Sum even numbers is " + sumOdd);

		/*
		 * declare a secret number;
		 * you want to ask user to guess your secret number
		 * you code should keep asking to guess until gets your secret number
		 * Once user gets the secret numbers -> you got it!
		 */
		int secret = 123456;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Write my secret number");
		int user = scanner.nextInt();
		while (secret != user) {
			System.out.println("Repeat");
			user = scanner.nextInt();
		} System.out.println("You got it, my number is "+secret);
		int secretNum = 1;
		int guessedNum;
		do {
			System.out.println("Guess my secret number");
			guessedNum = scanner.nextInt();
		} while (guessedNum != secretNum);
		System.out.println("You got it");
		scanner.close();
	}
	

}
