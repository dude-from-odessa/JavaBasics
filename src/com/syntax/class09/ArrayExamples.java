package com.syntax.class09;

public class ArrayExamples {

	public static void main(String[] args) {
		
		// I want to store prices in array
		
		double[] price = new double[6];
		
		price[1]=1.99;
		price[2]=2.99;
		price[3]=3.99;
		
		System.out.println(price[0]);
		
       int[] numbers = new int[4];
       
       numbers[0]=10;
       numbers[1]=11;
       numbers[2]=12;
       numbers[3]=13;
       
       // number [3]=13; during run time error -> ArrayIndexOutOfBoundsException
       // java is making runtime.
       
       System.out.println(numbers[1]);
      //arrays are fixed in sizw
      // during runtime JAVA cannot increase or decrease a size of an array
	}

}
