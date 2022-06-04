package com.syntax.class11;

public class Task7 {

	public static void main(String[] args) {
		
		int x = 10;
		boolean isPrime=true;
		
		if(x>1) {
			for(int i = 2; i<x;i++) {
				if(x%1==0) {
					isPrime=false;
					break;
				}
			}
			
		} else {
			isPrime = false;
		}
		if (isPrime) {
			System.out.println(x + " is Prime ");
		} else {
			System.out.println(x+" is not Prime ");
		}

	}

}
