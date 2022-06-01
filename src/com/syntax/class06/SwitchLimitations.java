package com.syntax.class06;

public class SwitchLimitations {

	public static void main(String[] args) {

		/*
		 * switch can work with byte, short, int, char, String
		 * 
		 * switch has a datatype limitations
		 * 
		 * switch cannot work with double, float,long boolean
		 */

		double price = 10;
		/*
		 * switch(price) { ->CE: Cannot switch on a value of type double }
		 * 
		 */
		
		boolean hungre = true;
		/*
		 * switch(hungre) { ->CE: Cannot switch on a value of type boolean }
		 * 
		 */
		
         /*
          * switch has a operators limitations
          * cannot use logical operators inside switch
          * cannot relational operators
          */
		char choice = 'Y';
		String meaning;

		switch (choice) {
		/*  case 'Y' || 'y':       --> CE : cannot use || (logical) or >= (relational)
		 *	meaning = "Yes";
		 *	break;
	     */
		case 'M':
			meaning = "Maybe";
			break;
		case 'N':
			meaning = "No";
			break;
		default:
			meaning = "UnKnown";
		}
		System.out.println(meaning);

	}
}
