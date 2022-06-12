package com.syntax.review06;

public class School {
	
	public static void main(String[] args) {
		
		
		// only main method can be run
		// class is like storage
		// student1 reference variable and Student is object
		Student student1 = new Student();	
		student1.name="Samira";
		student1.lastName="Pashayeva";
		student1.adress="Virgina";
		student1.studentId=101;
		student1.age=25;
		student1.grade='A';
		
		/* subject cannot be resolved
		 * student1.subject="Java";
		 */
		
		Student student2 = new Student();
		student2.name="Omid";
		student2.lastName="Mahmoodi";
		student2.adress="California";
		student2.studentId=102;
		student2.age=18;
		student2.grade='A';
		
		//accessing methods of Student class
		
		student2.study();
		student2.doHomework();
		
		System.out.println();

		student1.study();
		student1.doHomework();
		
		String s = "new";
		s.concat("all the time");
		System.out.println(s.concat("all the time"));
		
		
		System.out.println(student1.getFullName());
		
		System.out.println();
		
		student1.printInfo();
		
		System.out.println();
		
		System.out.println(student2.rating());
		
		student1.takeSubject("Java");
		student2.takeSubject("Biology");
		}
	

}
