package com.syntax.class16;

import com.syntax.class17.Employee;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        AccessModifiersDemo1 ac = new AccessModifiersDemo1();
       // System.out.println(ac.password); // private - only in class
        System.out.println(ac.ssn); // without - this package
        System.out.println(ac.name); // public - all packages
        String str = new String(); // we don't see any import because this class
        // is present inside the java.lang
        // all teh classes inside java.lang package are imported by default for you.
        Employee emp = new Employee();
        Scanner scanner = new Scanner(System.in);

        // if we want to create object of class which is not inside this package we
        // need to import this class to our package.

        // declare class as public it is almost always like this.
    }
}
