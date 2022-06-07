package com.syntax.class12;

public class HomeWork02 {

	public static void main(String[] args) {
		
		/*
		 * Create a String and print it in reverse order (Sunday → yadnuS).
		 */
		
		String str = "Sunday";
		String strNew="";
       for(int i = str.length()-1;i>=0;i--) {
    	
    	   strNew+=str.charAt(i);
       }
       System.out.println(strNew);

	}

}
