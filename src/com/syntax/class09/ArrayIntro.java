package com.syntax.class09;

public class ArrayIntro {

	public static void main(String[] args) {

		// create an array for intigers. 4 is number of elements to be stored.

		int[] b = new int[4];
		
		// stroe elements [0,1,2,3,4] - indexes
		
		b[0] = 90;
		b[1] = 85;
		b[2] = 70;
		b[3] = 100;
		
       //access values from my array
		System.out.println(b[2]); //70
		System.out.println(b[1]+b[3]); //185
		
		//we need to create an array of my classmates
		String[] classMates=new String[5];
		
		classMates[0]="Khrystyna"; 
		classMates[1]="Zammer";                    // ctrl+space : autocomplete
		classMates[2]="Elexia";
		classMates[3]="Oleg";
		classMates[4]="Adem";
		
		System.out.println("My classmate name is "+classMates[3]);
	}

}
