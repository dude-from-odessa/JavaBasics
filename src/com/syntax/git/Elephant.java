package com.syntax.git;

public class Elephant {

	public static void main(String[] args) {

		int[][] array = { { 434, 2344, 353, 1234, 2345, 2311, 4324 }, { 334, 14224, 3555, 12, 434, 35 },
				{ 34, 6667, 436, 564, 678, 453 } };

		for (int x[] : array) {
			for (int y : x) {
				System.out.print(y + " ");
			}
			System.out.println();
		}

	}

}
