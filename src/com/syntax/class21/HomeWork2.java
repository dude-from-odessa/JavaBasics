package com.syntax.class21;

import com.syntax.class03.HomeWork;

public class HomeWork2 {

    /*
    Create 1 class with a static method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
     */


    static void method(int x) {

        System.out.println("Int x = "+x);

    }

    static void method(int y, String x) {

        System.out.println("Int y = "+y);
        System.out.println("String x = "+x);

    }

    static void method(String x, int y) {

        System.out.println("String x = "+x);
        System.out.println("Int y = "+y);

    }
}

class Test3 {
    public static void main(String[] args) {

        HomeWork2.method(10);
        System.out.println("--------------------------------");
        HomeWork2.method(20,"Method");
        System.out.println("--------------------------------");
        HomeWork2.method("Method",20);

    }
}
