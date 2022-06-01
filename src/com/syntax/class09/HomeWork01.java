package com.syntax.class09;

public class HomeWork01 {

	public static void main(String[] args) {

		/*
		 * Create an array of cars and store 6 elements into it. Using 2 different loops
		 * print all values from the array.
		 * 
		 */
		String[] cars = new String[6];
		cars[0] = "Hyundai";
		cars[1] = "BMW";
		cars[2] = "Chevrolet";
		cars[3] = "Kia";
		cars[4] = "Lamborghini";
		cars[5] = "Ferrari";

		for (int i = 0; i < cars.length; i++) {
			System.out.print(cars[i] + " ");
		}
		System.out.println();

		String[] cars1 = { "Ford", "Mercedes-Benz", "Porshe", "Toyota", "Subaru", "Audi" };

		for (String car : cars1) {
			System.out.print(car + " ");
		}

	}

}
