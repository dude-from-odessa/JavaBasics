package com.syntax.class13;

public class HomeWork03 {

	public static void main(String[] args) {

		/*
		 * You have a String a=”Is it saturday? Is it raining? Do we have a Java Class
		 * today?” How would you find out how many sentences are in that String?
		 */

		String str = "Is it saturday? Is it raining? Do we have a Java Class today?";
		
		int counter = 0;
		
		for (int i = 0; i < str.length(); i++) {
			
			char x = str.charAt(i);
			
			if (x == '?' || x == '!' || x == '.') {
				counter++;
			}
		}
		
		System.out.println("String has "+counter+" sentences");
	}

}
