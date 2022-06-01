package com.syntax.class07;

public class DoWhileLoop {

	public static void main(String[] args) {

		int i = 0;

		do {
			System.out.print(i);
			i++;
		} while (i < 5);
		
		System.out.println("-----------------------");
		
		int num = 1;
		while (num <= 3) {
			System.out.print(num + " ");
			num++;
		}
		System.out.println("-------------------------");

		int num1 = 10;
		do {
			System.out.print(num1 + " ");
			num1++;
		} while (num1 <= 3);
		System.out.println();
		// print number 1 to 30 using do while
		int d = 1;
		do {
			System.out.print(d+" ");
			d++;
		} while(d<=30);
		
		System.out.println();
		//print even number from 70 to 30
		
		int num3 = 70;
		
		do {  
			System.out.print(num3+" ");
			num3-=2; // 68,66,64	
		} while (num3>=30);
	}

}
