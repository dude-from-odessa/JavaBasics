package com.syntax.review05;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysDemo2 {

	public static void main(String[] args) {

		String[] names = new String[5]; // creates an empty array of size 5 to store String type values
		/*
		 * names[0] = "Ahmed"; names[1] = "Abdulsamad"; names[2] = "Kaiser"; names[3] =
		 * "Zammeer"; names[4] = "Elisa";
		 */
		// name[5] ="Error";

		Scanner input = new Scanner(System.in);

		// names[0] = input.next(); // take input from the keyboard and store it on
		// index 0 in names array
		// names[1] = input.next();
		// names[2] = input.next();
		// names[3] = input.next();
		// names[4] = input.next();

		// above code has been replaced with a loop
		for (int i = 0; i < names.length; i++) {
			names[i] = input.next();
		}
		System.out.println(Arrays.toString(names)); // prints the value of array without loop
		input.close();
	}

}
