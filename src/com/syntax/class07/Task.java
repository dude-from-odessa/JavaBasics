package com.syntax.class07;

public class Task {

	public static void main(String[] args) {

		/*
		 * Print even numbers from 20 to 100
		 * 
		 * Print only odd numbers from 100 to 1
		 */

		int a = 20;

		while (a <= 100) {
			if (a % 2 == 0) {
				System.out.print(a + " ");
			}
			a++;

		}
		System.out.println();

		int b = 100;
		while (b >= 1) {
			if (b % 2 != 0) {
				System.out.print(b + " ");
			}
			b--;

		}
         // another way
		System.out.println();
		int y = 99;
		while (y >= 1) {
			System.out.print(y + " ");
			y -= 2;
		}

	}

}
