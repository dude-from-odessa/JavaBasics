package com.syntax.class06;

import java.util.Scanner;

public class HomeWorkSw01 {

	public static void main(String[] args) {

		/*
		 * Ask user to enter their country and capture it. Once values are captured
		 * print which language user speaks.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your country");
		String country = scan.nextLine();
		String lang;
		switch (country) {
		case "Ukraine":
			lang = "Ukrainian";
			break;
		case "Bulgaria":
			lang = "Bulgarian";
			break;
		case "USA":
			lang = "English";
			break;
		case "Finland":
			lang = "Finnish";
			break;
		case "Norway":
			lang = "Nynorsk Norwegian";
			break;
		case "Japan":
			lang = "Japanese";
			break;
		case "Sweden":
			lang = "Swedish";
			break;
		case "Romania":
			lang = "Romanian";
			break;
		default:
			lang = "unknown";

		}
		System.out.println("Your speaking " + lang + " language");
		scan.close();
	}

}
