package com.syntax.class02;

public class HomeWork2 {
	
	public static void main(String[] args) {
		
		  /*2.
		   * Write a program to find the square of the number 3.9. 
		   * You program should say "The square of the _is_"
		   */
		
		double number=3.9;
		double square=number*number;
		
		System.out.println("The square of the "+number+" is "+square);
		System.out.println("------------------------------------------------\n");
		
		float number1=3.9f;
		float square1=number1*number1;
		
		System.out.println("The square of the "+number1+" is "+square1+"\n");
		System.out.println("-------------------------------------------------\n");
		
		double a=3.9;
		double b=2.0;
		double square2=Math.pow(a, b);
		
		System.out.println("The square of the "+a+" is "+square2);

	}

}
