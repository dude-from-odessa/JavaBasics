package com.syntax.class03;

public class PrimitivesCasting {
	
	public static void main(String[] args) { //main+ctrl+space
				
		int i=100;
		double d=100;
		// syso+ctrl+space
		System.out.println(i);  // 100
		System.out.println(d);  // 100.0
		
		long l=10000;
		/*
		 * byte b=130; error :cannot convert from int to byte
		 * int x=99.99 error :cannot convert from double to int
		 */
		
		// Casting in Java is converting one value to another.
		
		/* widening / implicit / automatic
		 * byte-> short -> char -> int -> long -> float -> double
		 * 
		 * narrowing  / explicit / manually
		 * double -> float -> long -> int -> short -> byt * 
		 */ 
		
		
		int x=(int)99.99; // narrowing
		System.out.println(x);
		
		byte b=(byte)130; // will be minus result because of 010101 nymbers waht was store in box
		System.out.println(b);
		
		
	}

}
