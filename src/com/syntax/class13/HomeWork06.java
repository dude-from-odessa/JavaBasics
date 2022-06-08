package com.syntax.class13;

public class HomeWork06 {

	public static void main(String[] args) {
		
		// How would you swap  2 strings without a temporary variable?
		
		String x = "old";
		String y = "new";
		
        y=x+y;                // oldnew
        x=y.replace(x, "");   // new
        y=y.replace(x, "");   // old
        
        System.out.println(x);
        System.out.println(y);
        
	}

}
