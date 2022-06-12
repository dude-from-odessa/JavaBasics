package com.syntax.class14;

public class MethodsDemo4 {

	int sumNumbers(int num1, int num2) {
		return num1 + num2;
	}

	void print(String str, int num3) {

		for (int i = 0; i < num3; i++) {
			System.out.println(str);
		}

	}

	public static void main(String[] args) {

		MethodsDemo4 md = new MethodsDemo4();
		System.out.println(md.sumNumbers(10, 10));
		md.print("Gennadiy", 10);
	}

}
