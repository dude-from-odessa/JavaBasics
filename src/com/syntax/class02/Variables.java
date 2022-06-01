package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {
		/*
		 * Task
Create a Java program and name it Variables
In your program create different type of variables to store student’s information(name, last name, grade, city, state, phone number) and then print value of those variables in the format:
My name is ___ and my  last name is ____
I am A/B student 
I live in city__ and state____
And my phone number is …..
b)   Change student’s city, state, phone number and grade. And print those updated values:

Example:

My name is __ and I moved to new city__ and new state__. My new phone number is ___
		 */
		//part A
		String name="Gennadiy";
		String lastName="Babayev";
		char grade='A';
		String state="Florida";
		long phone=380934030809l;
		String city="Alachua";
		
		System.out.println("My name is "+name+" and my last name is "+lastName);
		System.out.println("I am "+grade+" student");
		System.out.println("I live in city "+city+" and state "+state);
		System.out.println("And my phone number is "+phone);
		
		//part B
		state="Odesskaya Oblast'";
		phone=38063403056l;
		city="Odessa";
		
		System.out.println("My name is "+name+" and I moved to new city "+city+" and new state "+state+"."+"My new phone number is "+phone);


		
		
		
		
		

	}

}
