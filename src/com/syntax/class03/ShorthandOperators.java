package com.syntax.class03;

public class ShorthandOperators {
public static void main(String[] args) {
	
	int num =100;
	num=num+100;
	System.out.println(num); //200
	
	num+=50;                //250
	System.out.println(num);
	num-=10; // num=num-10
	System.out.println(num);
	num*=10;
	System.out.println(num);
	num/=2;
	System.out.println(num);
	num%=2;
	System.out.println(num);
	
	int a=10, b=20, c=30;
	a+=b;
	System.out.println(a);
	a+=b+c;
	System.out.println(a);
	a*=10;
	System.out.println(a);
}
}
