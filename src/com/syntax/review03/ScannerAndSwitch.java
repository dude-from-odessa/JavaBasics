package com.syntax.review03;
import java.util.Scanner;
public class ScannerAndSwitch {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the name of the country");
		String country=scanner.nextLine();
        String capital;
		switch (country) {

		case "Turkey":
			capital = "Ankara";
			break;
		case "USA":
			capital = "DC";
			break;
		case "Serbia":
			capital = "Begrade";
			break;
		case "Albania":
			capital = "Tirana";
			break;
		case "Afganistan":
			capital = "Kabul";
			break;
		case "Pakistan":
			capital = "Islamabad";
			break;
		default:
			capital = "Not a valid country";
		} System.out.println(capital);
		scanner.close();
	}

}
