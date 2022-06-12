package com.syntax.review06;

public class Student {
	
	// define attributes/fields = variables
	
	String name,lastName,adress;
	
	int studentId,age;
	
	char grade;
	
	// define behaviour = methods
	
	void study() {
		
		System.out.println(name+" student is studying");
	}
	
	void doHomework() {
		
		System.out.println(name+" student is doing homework");
	}
	
	// create a method that will return name of a student in uppercase
	
	String getFullName() {
		
		return (name+" "+lastName).toUpperCase();
		
	}
	
	//create a method to print full info of a student
	
	void printInfo() {
		System.out.println(name+" "+lastName+" is "+age+" and lives in "+adress);
	}
	/*
	 * create a method that will return wether student
	 * is great,good,bad or average based on the grade
	 */
	
	String rating () {
		
		switch(grade) {
		
		case 'A' :
			return "great";
		case 'B' :
			return "good";
		case 'C' :
			return "average";

			default :
				return "bad";
				
		}
	}
	
	void takeSubject(String subject) {
		System.out.println(name+" studies "+subject);
	}

}
