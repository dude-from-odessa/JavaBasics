package com.syntax.class05;

import java.util.Scanner;

public class HomeWork06 {

	public static void main(String[] args) {

		/*
		 * Write a program that will read three inputs of scores (quiz, mid term, and
		 * final scores) and determine the grade based on the following rules: if the
		 * average score >=90 → grade=A if the average score >= 70 and <90 → grade=B if
		 * the average score>=50 and <70 → grade=C if the average score<50 → grade=F
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the quiz score : ");
		int q = scan.nextInt();
		System.out.print("Please enter the mid term score : ");
		int m = scan.nextInt();
		System.out.print("Please enter the final score : ");
		int f = scan.nextInt();
		int av = (q + m + f) / 3;
		if (av >= 90) {
			System.out.print("Grade = A");
		} else if (av >= 70 && av < 90) {
			System.out.print("Grade = B");
		} else if (av >= 50 && av < 70) {
			System.out.print("Grade = C");
		} else if (av < 50) {
			System.out.print("Grade = F");
		}
		scan.close();
	}

}
