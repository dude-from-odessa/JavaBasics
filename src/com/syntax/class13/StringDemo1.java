package com.syntax.class13;

public class StringDemo1 {

	public static void main(String[] args) {
		
		String str = "Batch 13 is good actually very good";
		
		System.out.println(str.replace("good", "Great"));
		
		System.out.println(str.replace("g", "G"));
		
		System.out.println(str.replaceFirst("g", "G"));

	}

}
