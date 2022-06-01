package com.syntax.class08;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {

		/*
		 * Write a program that reads a range of integers (start and end point),
		 * provided by a user and then from that range prints the sum of the even and
		 * odd integers.
		 * 
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter start point : ");
		int x = scanner.nextInt();
		System.out.print("Please enter end point : ");
		int y = scanner.nextInt();
		int even = 0;
		int odd = 0;

		for (int z = x; z <= y; z++) {
			if (z > y) {
				break;
			} else if (z % 2 == 0) {
				even += z;
			} else if (z % 2 != 0) {
				odd += z;
			}
		}
		for (int z = x; z >= y; z--) {
			if (z < y) {
				break;
			} else if (z % 2 == 0) {
				even += z;
			} else if (z % 2 != 0) {
				odd += z;
			}
		}
		System.out.println("Sum of the odd number = " + odd);
		System.out.println("Sum of the even number = " + even);
		scanner.close();
	}

}
