package com.syntax.class10;

public class AllElementsFrom2DArray {

	public static void main(String[] args) {

		String[][] usa = {

				{ "New York", "Albany", "Buffalo" },
				{ "Los Angeles", "San Fransisco", "San Jose", "San Diego", "Redding" },
				{ "Miami", "Orlando", "Niceville", "Tampa" }, { "Mclean", "Richmond", "Leesburg" }

		};

		// outer loop iterates over rows
		// inner loops iterates over colums

		for (int row = 0; row < usa.length; row++) {
			for (int col = 0; col < usa[row].length; col++) {
				System.out.println(usa[row][col] + " ");
			}
			System.out.println();
		}
		
		for(String[] row : usa ) {
			for(String col:row) {
				System.out.println(col);
			}
			System.out.println();
		}

	}

}
