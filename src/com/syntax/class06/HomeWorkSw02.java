package com.syntax.class06;

import java.util.Scanner;

public class HomeWorkSw02 {

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
		String exp;
		switch (grade) {
		case "A":
			exp = "A-Excellent";
			break;
		case "B":
			exp = "B-Good";
			break;
		case "C":
			exp = "C-Average";
			break;
		case "D":
			exp = "D-Bad";
			break;
		default:
			exp = "Not Acceptable";
		}
		System.out.println(exp);
		scan.close();
	}

}
