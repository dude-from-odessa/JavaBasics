package com.syntax.class23.home_work;

public class Main {

    /*
  Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
1. Define common behavior within parent class and override some of the methods in child classes
2. Define some methods specific to child classes
3. Write example of achieving run time polymorphism
     */

    public static void main(String[] args) {

        Student[] student = {new SchoolStudent("Bob"), new CollegeStudent("Rob"), new SyntaxStudent("Gennadiy")};

        for (Student i : student) {
            i.study();
        }
    }
}
