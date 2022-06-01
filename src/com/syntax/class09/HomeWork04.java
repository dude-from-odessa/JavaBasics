package com.syntax.class09;

public class HomeWork04 {

	public static void main(String[] args) {

		/*
		 * 1. Create an array on integers and calculate the sum of all elements in an
		 * array
		 * 
		 */

		int[] x = new int[6];

		x[0] = 345;
		x[1] = 46436;
		x[2] = 43;
		x[3] = 349;
		x[4] = 3543;
		x[5] = 345;

		System.out.println(x[0] + x[1] + x[2] + x[3] + x[4] + x[5]);
		System.out.println("-------------------------------------------");
		int sum = 0;
		for (int y = 0; y < x.length; y++) {

			sum += x[y];
		}
		System.out.println(sum);
		System.out.println("-------------------------------------------");
		int[] z = { 345, 46436, 43, 349, 3543, 345 };
		int sum1 = 0;
		for (int d : z) {
			sum1 += d;
		}
		System.out.println(sum1);
	}

}
