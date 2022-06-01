package com.syntax.class09;

public class AllValuesFromArray {

	public static void main(String[] args) {
		
		char[] grade = { 'A','B','C','D'};
		
		/*
		System.out.println(grade[0]);
		System.out.println(grade[1]);
		System.out.println(grade[2]);
		*/
		
		for(int i=0; i<grade.length;i++) {
			System.out.print(grade[i]+" ");
		}
		
		System.out.println();
		
		String[] words= {"Java", "Saturday", "day"};
		
		// I want to retrive all elements
		
		for(int i=0; i<words.length; i++) {
			
			System.out.println(words[i]+" ");
		}
           System.out.println("The end");
          System.out.println();
          
          /* Enchanced for loop/ advanced for loop/ for each loop
             CAN BE USED ONLY WHEN WE WORK WITH ARRAY
                      or
                  COLLECTIONS         
          */
          String[] colors= {"pink", "blue", "white", "black"};
          
          for(String color:colors) {
        	  System.out.println(color+" ");
          }
          
          System.out.println();
          
          int[] numbers = {10, 20, 30, 40};
          
          for(int num:numbers) {
        	  System.out.println(num);
          }
          
	}

}
