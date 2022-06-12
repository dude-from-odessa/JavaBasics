package com.syntax.class14;

public class MethodDemo2 {
	
	void print() {
		
		for(int i =0; i<5; i++) {
			System.out.println("Tara is great");
		}
	}
	
	public static void main(String[] args) {
		
		MethodDemo2 md = new MethodDemo2(); // Creating the object of a class
		
		md.printManyTimes(3);
	}
	
	void printManyTimes(int times) {
		
		for(int i =0; i<times; i++) {
			System.out.println("Tara is great");
		}
	}
}
