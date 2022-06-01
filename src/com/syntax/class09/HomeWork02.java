package com.syntax.class09;

public class HomeWork02 {

	public static void main(String[] args) {

		/*
		 * Create an array of animals and store 5 elements into it. Using 2 different
		 * loops print all elements from the array.
		 * 
		 */

		String[] animal = new String[5];

		animal[0] = "Lion";
		animal[1] = "Tiger";
		animal[2] = "Shark";
		animal[3] = "Bear";
		animal[4] = "Wolf";

		for (int x = 0; x < animal.length; x++) {
			System.out.print(animal[x] + " ");
		}
		System.out.println();
		String[] animals = { "Fox", "Snake", "Whale", "Crocodile", "Turtle" };

		for (String animals1 : animals) {
			System.out.print(animals1 + " ");
		}

	}

}
