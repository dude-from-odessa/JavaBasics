package com.syntax.class09;

public class MoreNestedLoops {

	public static void main(String[] args) {

		int x = 1;
		int y = 1;

		for (x = 1; x <= 10; x++) {

			for (y = 1; y <= 10; y++) {

				System.out.println(x + "*" + y + "=" + x * y);
			}

		}

		System.out.println(x + " " + y);
	}

}
