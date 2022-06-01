package com.syntax.review04;

public class NestedLoopDemo4 {

	public static void main(String[] args) {

		int f = 1;

		while (f <= 3) {
			int c = 1;
			while (c <= 2) {
				System.out.println(c);
				c++;
			}

			f++;
		}

	}

}
