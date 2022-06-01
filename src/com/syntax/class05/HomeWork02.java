package com.syntax.class05;

import java.util.Scanner;

public class HomeWork02 {

	public static void main(String[] args) {

		/*
		 * Create a Java program that will ask user to input city and temperature. Your
		 * program should convert Fahrenheit into celsius and print “The temperature is
		 * the city __ is __”
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the city name :");
		String city = scan.nextLine();
		System.out.println("Please enter the temperature in Fahrenheit :");
		int f = scan.nextInt();
		int c = (int) ((f - 32) * 0.5556);
		System.out.println("Temperature in " + city + " is " + c + " in celsius");
		scan.close();
	}

}
