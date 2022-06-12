package com.syntax.class14;

public class HomeWork2 {

	/*
	 * Create a method createEmail(). Based on values of users name, lastName and
	 * email type, your method should return complete email Address. Example:
	 * createEmail(John, Snow, gmail) → johnsnow@gmail.com
	 */

	String email(String name, String lastName, String domain) {

		String email = name + lastName + "@" + domain + ".com";

		return email.toLowerCase();

	}

	/*
	 * * Write a method to return whether given number is prime or not?
	 */

	boolean prime(int num) {

		if (num > 1) {

			for (int i = 2; i < num; i++) {

				if (num % i == 0) {
					return false;
				}
			}
		} else if (num <= 1) {
			return false;
		}
		return true;
	}
	
	/*
	 * Create class Student that will have a method getGrade. Your method should
	 * accept the score of a student and return a grade: score > 90 - A score >80 -
	 * B score >70 - C score > 50 - D anything else - F
	 */

	public class Student {

		char grade(int score) {

			if (score >= 90) {
				return 'A';
			} else if (score >= 80 && score < 90) {
				return 'B';
			} else if (score >= 70 && score < 80) {
				return 'C';
			} else if (score >= 50 && score < 70) {
				return 'D';
			} else {
				return 'F';
			}
		}

	}

	public static void main(String[] args) {


		HomeWork2 test = new HomeWork2();

		System.out.println(test.email("Gennadiy", "Babayev", "gmail"));
		System.out.println(test.prime(2));
		
		HomeWork2.Student me = test.new Student();  // To access the inner class, create an object of the outer class, and then create an object of the inner class:
		
		System.out.println(me.grade(90));
	}

}
