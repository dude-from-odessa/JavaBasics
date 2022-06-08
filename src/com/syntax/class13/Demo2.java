package com.syntax.class13;

public class Demo2 {

	public static void main(String[] args) {
		
		String str="sdflkjfgsjkj23432GDFGSF!@#$%^^^";
		
		System.out.println(str.replaceAll("[0-9]", "#")); // sdflkjfgsjkj#####GDFGSF!@#$%^^^
	
		System.out.println(str.replaceAll("[a-z]", "#")); // ############23432GDFGSF!@#$%^^^
		
		System.out.println(str.replaceAll("[A-Z]", "#")); // sdflkjfgsjkj23432######!@#$%^^^
		
		System.out.println(str.replaceAll("[A-Za-z0-9]", "#"));
		System.out.println(str.replaceAll("[^a-z]", "_"));
		System.out.println(str.replaceAll("[^A-Z]", "*"));
		System.out.println(str.replaceAll("[^A-Za-z0-9]", "*"));
		str="abcdefghijkl";
		System.out.println(str.replaceAll("[a-f]", "*"));
		str="sdflkjfgsjkj23432GDFGSF!@#$%^^^";
		System.out.println(str.replaceAll("[^A-z0-9]", "")); // remove the special characters
		System.out.println(str.replaceAll("[!-~]", "!"));    // ACII Table
		
		
	}

}
