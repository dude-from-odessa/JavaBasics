package com.syntax.class12;

public class StringDemo2 {

	public static void main(String[] args) {

		String firstName = "Adem";
		String lastName = "jones";
		String fullName = firstName + lastName; // always always prefer this
		String fullName2 = firstName.concat(lastName); // never use this because it can lead you to nullpointer
														// exception
		System.out.println(fullName2);
		System.out.println(fullName);

		String name = " ";
		System.out.println(name.isEmpty());

		String str = " ne  ver ";
		System.out.println(str.trim()); // removes spaces begin and end

	}

}
