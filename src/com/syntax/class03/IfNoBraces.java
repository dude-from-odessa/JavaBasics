package com.syntax.class03;

public class IfNoBraces {

	/*
	 * without braces java can identify only 1 statement per block
	 * 
	 */
	public static void main(String[] args) {

		String time = "morning";

		if (time.equals("Morning")) {
			System.out.println("Say Good Morning");
		} else {
			System.out.println("Say Good Day");
		}
		System.out.println("End of the code");
	}

}
