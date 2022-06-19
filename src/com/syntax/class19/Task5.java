package com.syntax.class19;

public class Task5 {

    public static void main(String[] args) {

        Student student = new Student("Best Student Ozkhan",99.9,98.8,99.5);
        student.calculateAvgGrade();

        Student student2 = new Student("Bad sameer",60.5,52.2,99.5);
        student2.calculateAvgGrade();
    }
}
