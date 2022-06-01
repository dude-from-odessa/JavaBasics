package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {

		boolean vaccine = true;
		int dose = 1;
		if (vaccine) {
			System.out.println("Let me check how many doses you have");
			if (dose == 1) {
				System.out.println("You need 1 more shot");
			}
		}
		System.out.println("----------------------------------------");

		// block is neested from if
		String month = "June";
		int day = 9;
		if (month.equals("May")) {
			System.out.println("Let me check");
			if (day == 8) {
				System.out.println("Today is a Mother Day");
			}
		} else if (month.equals("June")) {
			System.out.println("Let me check day in June");
			if (day == 19) {
				System.out.println("Today is a Father's Day");
			}
		}
	}

}
