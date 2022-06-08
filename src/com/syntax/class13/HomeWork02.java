package com.syntax.class13;

public class HomeWork02 {

	public static void main(String[] args) {
		
		/*
		 * Create a String that should be combination of letters, numbers and special characters. Find out how many Alphanumeric characters are there in the String.
         *
		 */
		
		String str = "abcde12345673243525213324fgdhgfdsghsdf!@#$ %^&*()_-=+,./|<>{}[];'~`*?";
		System.out.println("String : "+str);
		String str1=str.replaceAll("[A-Za-z0-9]","");
		System.out.println("There are "+(str.length()-str1.length())+" Alphanumeric characters int the String");
		
		

	}

}
