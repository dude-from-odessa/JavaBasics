package com.syntax.class10;

public class Recap {

	public static void main(String[] args) {

		String[] disney = { "Shrek", "Elsa", "Goofy", "Mulan", "Tom&Jerry" };
		System.out.println(disney[1]); // Elsa
		System.out.println("All elements using regular for loop --------");

		// to get all elements from an array

		for (int i = 0; i < disney.length; i++) {
			System.out.print(disney[i] + " ");
		}

		for (String character : disney) {
			
			if(character.equalsIgnoreCase("Mulan")) {
				System.out.println(character+" is my favorite character");
			} else {
			System.out.println(character + " "); }
		}
		
   for (int i = 0; i<disney.length;i++) {
	   if(disney[i].equalsIgnoreCase("Shrek")) {
		   System.out.println(disney[i]+" is my favorite character");
	   } else {
		   System.out.println(disney[i]);
	   }
   }
	}

}
