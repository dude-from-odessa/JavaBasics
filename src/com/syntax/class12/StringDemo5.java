package com.syntax.class12;

public class StringDemo5 {

	public static void main(String[] args) {
		
		String str="Sameer is gulbadan and he is";
		
		/*System.out.println(str.charAt(2));
		System.out.println(str.charAt(5));

		
		for(int i = 0; i<str.length();i++) {
			System.out.println(str.charAt(i));
		}
		*/
		int counter=0;
		for(int i = 0; i<str.length();i++) {
			if('s'==str.charAt(i) || 'S'==str.charAt(i)||'a'==str.charAt(i)||'A'==str.charAt(i)) {
				counter++;
			}
		}
			System.out.println("s appeared "+counter+" in the string");
	}

}
