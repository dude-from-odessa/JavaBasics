package com.syntax.class14;

public class MethodDemo3 {
	
	
	public static void main(String[] args) {
		MethodDemo3 md = new MethodDemo3();
		System.out.println(md.isEven(3));
		System.out.println(md.check("Gennadiy"));
		
			
		
	}

	// Write a method that takes an int value if that value is even this method
		// returns true otherwise it returns false
	
	boolean isEven(int number) {
		

		if (number%2==0) {
			return true;
		}else {
			return false;
		}

	}
	//write a method that takes a String and returns true if number of cahracters in that String
	// are even otherwise odd
	
	boolean check(String str) {
		if(str.length()%2==0) {
			return true;
		}else {
			return false;
		}
	}
}
