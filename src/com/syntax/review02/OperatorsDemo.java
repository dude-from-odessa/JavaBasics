package com.syntax.review02;

public class OperatorsDemo {

	public static void main(String[] args) {

		// Operators in Java Arithmetic Operators + - / * % Logical Operator == != >= <= > <
		// relation operator is without =, equality is with =.
		int num = 10;
		int num2 = 10;
		System.out.println(num + num2);
		System.out.println(num >= num2); // num>num2 or num=num2 f+t=t
        //WHole 0-infinity Negative infinity to Positive infinity
		System.out.println(Long.MAX_VALUE); // Gives us the maximum range
		System.out.println(Long.MIN_VALUE); // Gives us the maximum range
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(num/num2);
		System.out.println(num%num2);
		System.out.println(10/3);
		System.out.println(10%3);
		System.out.println(10.0/3.0);
	    System.out.println((int)10.0/3);
	}

}
