package com.syntax.review05;

public class ArraysDemo5 {

	public static void main(String[] args) {

		int[] arr = { 1, 5, 8, 9 };

		// we can't use advance for loop to update to insert values in an array
		
		int x = 0;
		for (int number : arr) {
			arr[x] = 1;
			x++;
		}

		for (int number : arr) {
			System.out.print(number + " ");
		}

	}

}
