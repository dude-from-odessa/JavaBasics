package com.syntax.class06;

import java.util.Scanner;

public class EnhancedCode {

	public static void main(String[] args) {

		/*
		 * if you are A or B studet --> you are doing great otherwise --> please try to
		 * study more
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the quiz score : ");
		int quiz = scan.nextInt();
		System.out.print("Please enter the mid term score : ");
		int mid = scan.nextInt();
		System.out.print("Please enter the final score : ");
		int fin = scan.nextInt();
		int averageS = (quiz + mid + fin) / 3;
		char grade;

		if (averageS >= 90) {
			grade = 'A';
		} else if (averageS >= 70 && averageS < 90) {
			grade = 'B';
		} else if (averageS >= 50 && averageS < 70) {
			grade = 'C';
		} else {
			grade = 'F';
		}
		System.out.println("You are a " + grade + " student");
		if (grade == 'A' || grade == 'B') {
			System.out.println("you are doing great");
		} else {
			System.out.println("please try to study more");
		}
		scan.close();
	}

}
