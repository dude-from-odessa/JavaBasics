package com.syntax.class07;

public class WhileLoopExaples {

	public static void main(String[] args) {
		// print number from 1 to 10

		int num = 1;

		while (num <= 10) {

			System.out.print(num + " ");
			num++;
		}

		// print numbers from 1 to 10;
		System.out.println();
		int num1 = 0;
		while (num1 < 10) {
			num1++;
			System.out.print(num1 + " ");
		}

		// print numbers from 10 to 100
		System.out.println();

		int a = 10;
		while (a <= 100) {
			System.out.print(a + " ");
			a++;
		}
		System.out.println();
		int b = 10;
		while (b >= 1) {
			System.out.print(b + " ");
			b--;
		}

		// print from -1 to -10
		System.out.println();
		int g = -1;
		while (g >= -10) {
			System.out.print(g + " ");
			g--;
		}
		// print numbers from 1 to 20 but only even numbers
		System.out.println("----------------");
		int e = 2;
		while (e <= 20) {
			System.out.print(e + " ");
			e += 2;
		}

		// 2 way
		System.out.println();
		int f = 1;
		while (f <= 20) {
			if (f % 2 == 0) {
				System.out.print(f + " ");
			} 
			f++;
		}
		

	}
}
