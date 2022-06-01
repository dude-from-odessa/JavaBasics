package com.syntax.class10;

public class Task02 {

	public static void main(String[] args) {

		// Create an array to store char values and then print those in reverse order

		char[] character = { 'A', 'B', 'C', 'D', 'E', 'F', 'G' };

		for (int x = (character.length - 1); x >= 0; x--) {

			System.out.print(character[x] + " ");

		}

	}
}
