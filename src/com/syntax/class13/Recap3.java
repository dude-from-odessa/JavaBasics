package com.syntax.class13;

public class Recap3 {

	public static void main(String[] args) {

		String str = "amdscscd56rt#Confused#treery";
		
		System.out.println(str.substring(str.indexOf('#')+1, str.indexOf('#',str.indexOf('#')+1)));
		
		str="Asghar is Great";
		System.out.println(str.substring(0,6));
		System.out.println(str.indexOf('#',str.indexOf('#')+1));
	}

}
