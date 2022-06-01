package com.syntax.class10;

public class Task01 {

	public static void main(String[] args) {

		// From an array of integer elements find the largest number.

		int[] numbers = { 3443, 5443, 23, 454, 2345, 3225, 754 };

		int largest = 0;

		for (int x : numbers) {

			if (x > largest) {

				largest = x;
			}
		}

		System.out.println(largest);

	}

}
