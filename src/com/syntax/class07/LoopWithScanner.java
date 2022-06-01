package com.syntax.class07;
import java.util.Scanner;
public class LoopWithScanner {

	public static void main(String[] args) {
		/*
		 * we are going to ask if you got a job
		 * we will cont. asking if you get a job untill you say yes!
		 * once you say yes --> congr
		 */
		String job;
		int times = 1;
		Scanner scanner = new Scanner(System.in);
		
		do {
		System.out.println("Did you get a job?");	
		job = scanner.nextLine();
		} while (!job.equals("Yes"));
	
		System.out.println("Congratulations");
	
		System.out.println("-----------------------------");
		
		Scanner input = new Scanner(System.in);
		String offer;
		System.out.println("Did you get a job?");
		offer=input.nextLine();
		
		while (!offer.equalsIgnoreCase("yes")) {
			System.out.println("Did you get a job?");
			offer=input.nextLine();
		} System.out.println("Congratulations");
		
      scanner.close();
      input.close();
	}

}
