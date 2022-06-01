package com.syntax.class07;

public class PreincrementAndPostincrement {

	public static void main(String[] args) {
	
		
		int num = 10;
		
		int result=num++; // post value first use and then increment
		System.out.println("Value of num = "+num);
		System.out.println("Value of result = "+result);
		
		int num1=10;
		int result1=++num1; // preincrement first increment and then use
		System.out.println("Value of num = "+num1);
		System.out.println("Value of result = "+result1);
	}

}
