package com.syntax.class16;

public class Tester {

    public static void main(String[] args) {
        AccessModifiersDemo1 ac = new AccessModifiersDemo1();
       // System.out.println(ac.password); // private - only in class
        System.out.println(ac.ssn); // without - this package
        System.out.println(ac.name); // public - all packages
    }
}
