package com.syntax.review03;

public class IfElse6 {

	public static void main(String[] args) {
		
		
		String country = "Pakistan";
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

	}

}
