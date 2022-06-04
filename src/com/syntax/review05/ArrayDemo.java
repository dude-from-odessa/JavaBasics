package com.syntax.review05;

public class ArrayDemo {

	public static void main(String[] args) {

		// should create an array

		String name = "Oleg";
		String name2 = "King";
		String name3 = "Mumtaz";

		// should not create an array

		String city = "New York";
		String country = "USA";
		String continent = "America";
        //only used 5% of times
		String[] names = { "Oleg", "King", "Mumtaz" };
		//95% of the times you guys will use this approach
		String[] names2=new String[3]; //creates an empty array
		names2[0]="Oleg"; // stores oleg on first position
		names2[1]="King";
		names2[2]="Mumtaz";
		
	}

}
