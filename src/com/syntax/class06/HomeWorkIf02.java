package com.syntax.class06;

import java.util.Scanner;

public class HomeWorkIf02 {

	public static void main(String[] args) {

		/*
		 * * Allow user to enter grade (A, B, or C etc...) and then provide explanation:
		 * A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. At
		 * the end your program should print which grade was entered by a user with
		 * explanation.
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your grade");
		String grade = scan.next();

		if (grade.equals("A")) {
			System.out.println("A-Excellent");
		} else if (grade.equals("B")) {
			System.out.println("B-Good");
		} else if (grade.equals("C")) {
			System.out.println("C-Average");
		} else if (grade.equals("D")) {
			System.out.println("D-Bad");
		} else {
			System.out.println("Not Acceptable");
		}
		scan.close();
	}

}
