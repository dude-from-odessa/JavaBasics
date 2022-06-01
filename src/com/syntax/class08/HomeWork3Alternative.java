package com.syntax.class08;

public class HomeWork3Alternative {

	public static void main(String[] args) {

		int a = 0, b = 0, c = 0, d = 0;
		for (a = 0; a <= 2; a++) {
			for (b = 0; b <= 4; b++) {
				if (a == 2 && b == 4) {
					break;
				}
				for (c = 0; c <= 5; c++) {
					for (d = 0; d <= 9; d++) {
						System.out.println(a + "" + b + " : " + c + "" + d);

					}
				}
			}
		}

	}

}
