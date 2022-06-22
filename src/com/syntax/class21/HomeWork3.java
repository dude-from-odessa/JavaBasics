package com.syntax.class21;

public class HomeWork3 {

    /*
    Create 1 class with a private method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
     */


    private static void method(int x) {

        System.out.println("Int x = " + x);

    }

    private static void method(int y, String x) {

        System.out.println("Int y = " + y);
        System.out.println("String x = " + x);

    }

    private static void method(String x, int y) {

        System.out.println("String x = " + x);
        System.out.println("Int y = " + y);

    }
}

class Test4 {
    public static void main(String[] args) {

        //  HomeWork3.method(10); 'method(int)' has private access in 'com.syntax.class21.HomeWork3'
        System.out.println("--------------------------------");
        //  HomeWork3.method(20,"Method"); 'method(int, java.lang.String)' has private access in 'com.syntax.class21.HomeWork3
        System.out.println("--------------------------------");
        //   HomeWork3.method("Method",20); 'method(java.lang.String, int)' has private access in 'com.syntax.class21.HomeWork3'

    }
}