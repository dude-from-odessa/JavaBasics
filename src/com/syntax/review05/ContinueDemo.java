package com.syntax.review05;

public class ContinueDemo {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			System.out.println("Batch 13 is great");
			if (i > 2) {
				continue;
			}

			System.out.println("Batch 13 is excellent");
		}
		System.out.println();
		for (int i = 0; i < 5; i++) {
			System.out.println("Batch 13 is great");
			if (i <= 2) {
				System.out.println("Batch 13 is excellent");
			}

		}

	}

}
