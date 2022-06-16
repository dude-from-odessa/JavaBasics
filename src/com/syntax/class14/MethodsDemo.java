package com.syntax.class14;

import java.util.Scanner;

public class MethodsDemo {
	
	
	// Method is a block of code a group of java statements that are grouped together and
	// we can execute those statements buy just creating an object of the class that contains
	// How : that method and by writing the objects name.method name
	
	
	void printHello() {
		
		System.out.println("How are you guys");

	}
	boolean returnTrue() {
		return true;
	}
	
	int returnInt() {
		return 10;
	}
	//Methods that return something and methods that don't return something
	public static void main(String[] args) {
		//Method cannot be created inside of other method
		// void will not return value even null
		// first data type of return value, next name of method () {return true}
		MethodsDemo md = new MethodsDemo();
		md.printHello();
		
		boolean xs = md.returnTrue();
		System.out.println(xs);
		
		int num = md.returnInt();
		System.out.println(num);
		
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		
		scanner.close();
		
	}

}
