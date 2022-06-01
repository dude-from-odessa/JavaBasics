package com.syntax.class09;

public class Task01 {

	public static void main(String[] args) {

		/*
		 * Create an array of chars and store grades into it: A,B,C,D,E,F. Then print a
		 * grade B (use 2 different ways of creating an array).
		 * 
		 * 2. Create an array of words: Java, Saturday, day, coding, is. Print the
		 * following sentence using elements of array: “Saturday is Java coding Day”.
		 */

		char[] grade = new char[6];
		grade[0] = 'A';
		grade[1] = 'B';
		grade[2] = 'C';
		grade[3] = 'D';
		grade[4] = 'E';
		grade[5] = 'F';

		System.out.println(grade[1]);

		char[] grades = { 'a', 'b', 'c', 'd', 'e', 'f' };

		System.out.println(grades[3]);

		for (int x = 0; x < grade.length; x++) {
			System.out.print(grade[x] + " ");
		}
		System.out.println();
		for (char print : grades) {
			System.out.print(print + " ");
		}
		System.out.println();
		String[] words = new String[5];
		words[0] = "Java";
		words[1] = "Saturday";
		words[2] = "Day";
		words[3] = "coding";
		words[4] = "is";

		for (int x = 0; x < words.length; x++) {
			System.out.print(words[x] + " ");
		}

		System.out.println();
		String[] word = { "Java", "Saturday", "Day", "coding", "is" };
		for (String print : word) {
			System.out.print(print + " ");
		}
		System.out.println();
		
		System.out.println(word[1]+" "+word[4]+" "+word[0]+" "+word[3]+" "+word[2]);
	}

}
