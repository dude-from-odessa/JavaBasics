package com.syntax.class08;

public class ForLoopIntro {

	public static void main(String[] args) {

		/*
		 * 
		 * while (condition) { block of code } do {code;} while (condition)
		 * 
		 * when we have to execute code at least one time.
		 * 
		 * for loop - executes block of code as long as condition is true
		 * 
		 * for loop is the Best choice to use when know how many times we want/need to
		 * repeat block of code.
		 * 
		 * for(initialization;condition;increment/decrement){code}
		 * 
		 * 
		 * we use while or do loop - when we do not know number of iterations
		 * 
		 * 
		 */
		// I want to say GM 5 times

		for (int i = 1; i <= 5; i++) {
			System.out.println("Good Morning");        // 5
		}
		for (int i = 1; i >= 5; i++) {
			System.out.println("How are you");         // 0
		}
		System.out.println("-------------------------");
		/*  for (int i = 1; i >= 5; i--) {
			System.out.println("Hello");
		    }
		*/

	}
}
