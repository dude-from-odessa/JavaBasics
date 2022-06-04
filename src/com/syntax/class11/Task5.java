package com.syntax.class11;

public class Task5 {

	public static void main(String[] args) {

		/*
		 * Create a 2D array of integers. Develop a program which will calculate the sum
		 * of even and odd numbers for that array.
		 */
		int[][] arr = { { 10, 10, 10 }, { 20, 20, 20 }, { 30, 30, 30, 30 } };

		int evenSum = 0;
		int oddSum = 0;

		for (int j = 0; j < arr.length; j++) {

			for (int i = 0; i < arr[j].length; i++) {

				if (arr[j][i] % 2 == 0) {

					evenSum += arr[j][i];

				} else {

					oddSum += arr[j][i];

				}
			}
		}
		System.out.println("Odd Sum " + oddSum);
		System.out.println("Even Sum " + evenSum);
	}

}
