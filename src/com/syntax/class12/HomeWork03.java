package com.syntax.class12;

import java.util.Scanner;

public class HomeWork03 {

	public static void main(String[] args) {
		
		/*
		 * Write a program that reads two people's first
	       names and if they expecting boy or girl? 
           Based on the input suggests a name for a baby:
           
           Example Output:
           Mom's first name? Mary
           Dad's first name? Daniel
           Boy or Girl? boy
           Suggested baby name: DANRY

           Example Output:
           Mom's first name? Mary
           Dad's first name? Daniel
           Boy or Girl? girl
           Suggested baby name: MAIEL
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Mom's first name?");
		String mom = input.nextLine();
		System.out.println("Dad's first name?");
		String dad = input.nextLine();
		System.out.println("Boy or Girl?");
		String gender = input.nextLine();
		String name = "";

		if (gender.equalsIgnoreCase("boy")) {
			name += dad.substring(0, dad.length() / 2);
			name += mom.substring(mom.length() / 2);
		} else if (gender.equalsIgnoreCase("girl")) {
			name += mom.substring(0, mom.length() / 2);
			name += dad.substring(dad.length() / 2);
		}

		System.out.println(name.toUpperCase());
		input.close();
	}

}
