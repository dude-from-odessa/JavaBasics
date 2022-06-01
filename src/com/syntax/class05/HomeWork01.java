package com.syntax.class05;

import java.util.Scanner;

public class HomeWork01 {

	public static void main(String[] args) {

		/*
		 * You are a loan specialist and you need to ask user what is the amount of loan
		 * is needed. If loan is less or equal to 200,000 then you would lend the money
		 * otherwise you would reject the client
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("How much amount do you need for loan?");
		int loan = scan.nextInt();
		if (loan <= 200000) {
			System.out.println("Yours loan is approved");
		} else if (loan > 200000) {
			System.out.println("Yours loan is rejected");
		}
		scan.close();
	}

}
