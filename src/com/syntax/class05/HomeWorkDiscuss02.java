package com.syntax.class05;

import java.util.Scanner;

public class HomeWorkDiscuss02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter name");
		String name = scan.nextLine();
		System.out.println(name);

		System.out.println("Please enter age");
		int age = scan.nextInt();
		System.out.println(age);

		System.out.println("Please enter price");
		double price = scan.nextDouble();
		System.out.println(price);

		System.out.println("Please enter boolean");
		boolean boo = scan.nextBoolean();
		System.out.println(boo);
		System.out.println("Please enter character");
		char j = scan.next().charAt(0);
		System.out.println(j);
		scan.close();

	}

}
