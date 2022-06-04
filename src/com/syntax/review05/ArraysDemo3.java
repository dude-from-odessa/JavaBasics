package com.syntax.review05;

import java.util.Scanner;
import java.util.Arrays;

public class ArraysDemo3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scanner.nextInt(); // asks for the size of array
		String[] names = new String[size]; // an array of Strings of that size is created
		
		for (int i = 0; i < names.length; i++) {
			names[i] = scanner.next(); // fill the array with the input from user
		}

		System.out.println(Arrays.toString(names)); // print the contents of array
		
		scanner.close();
	}
	

}
