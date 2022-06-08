package com.syntax.class13;

public class HomeWork04 {

	public static void main(String[] args) {

		/*
		 * How would you reverse a String word by word? for example // input=>This is
		 * sentence i want to reverse // output=>sihT si ecnetnes i tnaw ot esrever
		 */

		String str = "This is sentence i want to reverse";
		
		String str0=str.trim()+" ";
		
		String str1 = "";
		
		String str2 = "";
		
		int x = 0;
		
		for (int i = 0; i < str0.length(); i++) {

			if (str0.charAt(i) == ' ') {

				str1 = str0.substring(x, i+1);

				x = i+1;
				
				for (int y = str1.length() - 1; y >= 0; y--) {
					
					str2 += str1.charAt(y);
				}
			}
		}
		System.out.println(str2.trim());
	}

}
