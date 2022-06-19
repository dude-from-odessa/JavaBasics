package com.syntax.class19;

public class ClassA {

    /*
1. Write program for multilevel inheritance where class C inherits from class B and Class B inherits from Class A.
2. Write program to inherit class A that has method printF which is static and call or reuse that method into class B
     */
    String name;
    int x;
    int y;


    static public void printF() {
        System.out.println("Class A method is used");
    }

}

class ClassB extends ClassA {

    // ClassB inherits from ClassA

}

class ClassC extends ClassB {

    // ClassC inherits from ClassB

}

class TesterABC {

    public static void main(String[] args) {

        ClassB.printF();   //  class A -->  method "printF()" was used with ClassB

    }
}