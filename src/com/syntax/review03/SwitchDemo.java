package com.syntax.review03;

public class SwitchDemo {

	public static void main(String[] args) {

		
		
		String country = "Pakistan";

		switch (country) {

		case "Turkey":
			System.out.println("Ankara");
			break;
		case "USA":
			System.out.println("DC");
			break;
		case "Serbia":
			System.out.println("Begrade");
			break;
		case "Albania":
			System.out.println("Tirana");
			break;
		case "Afganistan":
			System.out.println("Kabul");
			break;
		case "Pakistan":
			System.out.println("Islamabad");
			break;
		default:
			System.out.println("Not a valid country");
		}

	}
}
