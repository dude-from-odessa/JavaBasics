package com.syntax.class28.home_work;

import java.util.HashSet;
import java.util.Iterator;

public class HomeWork4 extends Student {

    public static void main(String[] args) {

        /*
        Create a Set collection that will hold Objects of Student Type.
        In this set we do not care about the insertion order.
        Each student object should have name and studentID. Display name of each student.
         */



    HashSet<Student> students = new HashSet<>();

    students.add(new Student("Jane",2346));
    students.add(new Student("John",43566));
    students.add(new Student("Joseph",6857));

    for(Student student : students) {
        System.out.println(student.getName());
    }

    }


}
class Student {

    private String name;
    private int studentId;

    Student(String name, int studentId){

        this.studentId = studentId;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    Student(){

    }

}

