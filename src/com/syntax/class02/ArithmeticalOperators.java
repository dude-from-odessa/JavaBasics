package com.syntax.class02;

public class ArithmeticalOperators {

	public static void main(String[] args) {
	
		int num1=40;
		int num2=20;
		
		System.out.println(num1/num2); // value result is not store enywhere
		
		int sum, sub, mult, div;
		
		sum=num1+num2;
		System.out.println(sum);
		
		sub=num1-num2;
		System.out.println(sub);
		
		mult=num1*num2;
		System.out.println(mult);
		
		div=num1/num2;
		System.out.println(div);
		
		double num3=9.99;
		double num4=3.50;
		double sum1, sub1, mult1, div1;
		
		sum1=num3+num4; // first calculating than diclaring. assigment(right to left) and execution (left to right)
		System.out.println("-----------------------");
		int a=10;
		int b=3;
		
		int result=a/b; // when you dev better to use double
		System.out.println(result);
		System.out.println("-----------------------");
		
		double c=10.0;
		double d=3.0;
		
		double result2=c/d;
		System.out.println(result2);
		
		float e=10.0f;
		float f=3.0f;
		
		float result3=e/f;
		System.out.println(result3);
		
		
		
		
		
		
		

	}

}
