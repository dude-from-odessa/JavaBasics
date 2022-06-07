package com.syntax.class12;

public class StringDemo3 {

	public static void main(String[] args) {

		String str = "Batch 13 is Great";

		System.out.println(str.startsWith("Batch"));
		System.out.println(str.endsWith("t"));
		System.out.println(str.endsWith("Great"));
		System.out.println(str.toLowerCase().endsWith("great"));
		
		String name = "HAMID";
		System.out.println(name.toLowerCase()); // String has immutable behaviour - any method of string class does not make any changes to original string
		System.out.println(name);
		System.out.println(str.contains("13"));
		System.out.println(str.contains("is"));
		System.out.println(str.toLowerCase().contains("batch"));
	}

}
