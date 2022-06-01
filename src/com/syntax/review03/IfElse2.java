package com.syntax.review03;

public class IfElse2 {

	public static void main(String[] args) {

		// when code executes but does not produce expected results we call these
		// mistakes logical errors
		// when code does not even executes we call these mistakes syntax errors

		String day = "Friday"; // in non-primitive type variables we can store null wich means nothinh(empty)
		if (day.equals("Monday")) {
			System.out.println("weekday");
		} else if ("Tuesday".equals(day)) {
			System.out.println("weekday");
		} else if ("Wednesday".equals(day)) { // this code is faster
			System.out.println("weekday");
		} else if ("Thursday".equals(day)) {
			System.out.println("weekday");
		} else if ("Friday".equals(day)) {
			System.out.println("weekday");
		} else if ("Saturday".equals(day)) {
			System.out.println("Weekend");
		} else if ("Sunday".equals(day))
			;
		{
			System.out.println("Weekend");
		}
//---------------------------------------------------------------------------------
		if (day.contentEquals("Monday") || "Tuesday".equals(day) || "Wednesday".equals("day")
				|| "Thursday".equals(day)) {
			System.out.println("weekday");
		} else if ("Saturday".equals(day) || "Sunday".equals(day)) {                  // this code is much faster
			System.out.println("Weekend");
		} else {
			System.out.println("Not a valid day");
		}
//---------------------------------------------------------------------------------
		if (day.equals("Monday"))

		{
			System.out.println("weekday"); // this code is slower
		}
		if ("Tuesday".equals(day)) {
			System.out.println("weekday");
		}
//---------------------------------------------------------------------------------		

	}

}
