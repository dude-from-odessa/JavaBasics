package com.syntax.class11;

import java.util.Arrays;

public class Task10 {

	public static void main(String[] args) {

		/*
		 * Write a java program to find the second largest number in the array?
		 */
		int[] arr = { 10, 20, 5, 6, 8, 9, 200 };
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[0]);
		System.out.println(arr[arr.length - 1]);
		System.out.println(arr[arr.length - 2]);
		int maxNumber = arr[0];
		int secondLargest = arr[0];
		for (int num : arr) {
			if (num > maxNumber) {
				secondLargest=maxNumber;
				maxNumber = num;
			}
			if (num > secondLargest && secondLargest < maxNumber && num < maxNumber) {
				secondLargest = num;
			}
		}
		System.out.println(maxNumber);
		System.out.println(secondLargest);
	}

}
