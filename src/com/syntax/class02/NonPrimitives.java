package com.syntax.class02;

public class NonPrimitives {

	public static void main(String[] args) {
		
      String name="Oleg";
      
      String lastName="Smith";
      
      long phone=1234567890L;  //xxx-xxx-xxxx
      
      String phoneNumber="123-456-7890";
      
      String address="123 Washington str";
      
      int age =30;
      String city="Miami";
      
      //shortcut for printing
      // type syso + ctrl + space --> hit enter
      
      System.out.println(name+" "+lastName);   //Oleg Smith
      
      /* we can use + -> works as concatenation operator
       * to attach String to another String to any other value
       * 
       */
      // to add space you can add to name, space is character
      // Oleg lives in Miami
      
      System.out.println(name+" lives in "+city);
      
      //Oleg is 30 years old
      
      System.out.println(name+" is "+age+" years old"); 
      
      // if we can one string we can use + sign
      // string is combination of different characters
      
      int x = 10;
      double c = 3.14;
      
      System.out.println(x+c);
      
      
	}

}
