package com.syntax.class06;

public class SwitchIntro {

	public static void main(String[] args) {

		String name;
		
		int day = 3;
		
		if (day == 1) {
			name = "Monday";
		} else if (day == 2) {
			name = "Tuesday";
		} else if (day == 3) {
			name = "Wednesday";
		} else if (day == 4) {
			name = "Thursday";
		} else if (day == 5) {
			name = "Friday";
		} else if (day == 6) {
			name = "Saturday";
		} else if (day == 7) {
			name = "Sunday";
		} else {               // else is always the last block
			name = "Invalid";
		}
		System.out.println(name);
		System.out.println("-----------------");
		switch (day) {   // dwitch is a value based statement
		case 1:
			name = "Monday";
			break;
		case 2:
			name = "Tuesday";
			break;
		case 3:
			name = "Wednesday";
			break;
		case 4:
			name = "Thursday";
			break;
		case 5:
			name = "Friday";
			break;
		case 6:
			name = "Saturday";
			break;
		case 7:
			name = "Sunday";
			break;
		default:               // can be enywere but better on the bottom
			name = "Invalid";  // no need break. break executes the code
		}
		System.out.println(name);
	}
}
