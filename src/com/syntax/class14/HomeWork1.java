package com.syntax.class14;

public class HomeWork1 {

	/*
	 * Create a method that will take 2 parameters as a numbers and prints which
	 * number is larger.
	 */

	void large(int num1, int num2) {

		if (num1 > num2) {

			System.out.println(num1 + " is the largest number");

		} else if (num2 > num1) {

			System.out.println(num2 + " is the largest number");
		} else {
			System.out.println(num1 + " is equal to " + num2);
		}

	}

	/*
	 * Create a method that will take a number and prints whether the number is even
	 * or odd.
	 * 
	 */
	void oddEven(int num) {

		if (num % 2 == 0) {
			System.out.println(num + " is even number");
		} else {
			System.out.println(num + " is odd number");
		}
	}

	void palidrome(String str) {

		/*
		 * Create a method that will print whether given String is palindrome or not.
		 */

		StringBuilder st = new StringBuilder(str);

		st.reverse();

		if (st.toString().equals(str)) {

			System.out.println(str + " is palidrome");
		} else {
			System.out.println(str + " is not palidrome");
		}

	}

	/*
	 * Create a method that will say Hello in different language based on the
	 * country that will passed when method is executed
	 * 
	 */

	void hello(String country) {

		String hi;
		switch (country) {

		case "Ukraine":
			hi = "Привіт";
			break;

		case "USA":
			hi = "Hello";
			break;

		case "India":
			hi = "Namaste";
			break;

		case "Italy":
			hi = "Ciao";
			break;

		case "Türkiye":
			hi = "Merhaba";
			break;

		case "Japan":
			hi = "Kon’nichiwa";
			break;

		default:
			hi = "I don't have information regarding this country";

		}
		System.out.println(hi);

	}

	public static void main(String[] args) {

		HomeWork1 test = new HomeWork1();

		test.large(-5, 10);
		test.oddEven(10);
		test.palidrome("abba");
		test.hello("Italy");
	}

}
