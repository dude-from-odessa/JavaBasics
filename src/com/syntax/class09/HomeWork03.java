package com.syntax.class09;

public class HomeWork03 {

	public static void main(String[] args) {

		/*
		 * Create an array to store double values and then print all elements using 2
		 * different loops
		 * 
		 */

		double[] num = new double[5];

		num[0] = 1.2;
		num[1] = 2.5;
		num[2] = 3.2;
		num[3] = 4.6;
		num[4] = 3.9;

		for (int num1 = 0; num1 < num.length; num1++) {
			System.out.print(num[num1] + " ");
		}
		System.out.println();

		double[] num2 = { 3.4, 5.6, 7.5, 8.4, 9.3 };

		for (double num3 : num2) {
			System.out.print(num3 + " ");
		}

	}

}
