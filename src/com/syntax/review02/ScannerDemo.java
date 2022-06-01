package com.syntax.review02;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter your age");
		int age = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Plerase Enter your name");
		String name = scanner.nextLine();
		System.out.println(age + name);
		scanner.close();

	}

}
