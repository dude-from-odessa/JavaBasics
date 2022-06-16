package com.syntax.class18;

public class TaskStudents {

    /*
    Write a java Class Students that have a constructor which takes students name and 3 subject grades.
    Inside your class also have a method to Calculate Average Grade.
    Test Student class for 5 different students with different marks.
    Your program should print an average mark of each students name.
    NOTE: please use different names for instance and local variables
     */

    String name;
    int subGrade1;
    int subGrade2;
    int subGrade3;


    TaskStudents(String nameS, int subGradeS1, int subGradeS2, int subGradeS3) {

        name = nameS;
        subGrade1 = subGradeS1;
        subGrade2 = subGradeS2;
        subGrade3 = subGradeS3;

    }

    void averGrade () {

        System.out.println("Student "+name+" has average grade : "+((subGrade1+subGrade2+subGrade3)/3));
    }

    public static void main(String[] args) {

        TaskStudents std1 = new TaskStudents("Bob",65,80,85);
        TaskStudents std2 = new TaskStudents("Rob",80,50,70);
        TaskStudents std3 = new TaskStudents("John",78,90,69);
        TaskStudents std4 = new TaskStudents("Sara",80,85,90);
        TaskStudents std5 = new TaskStudents("Flint",34,23,60);

        std1.averGrade();
        std2.averGrade();
        std3.averGrade();
        std4.averGrade();
        std5.averGrade();
    }

}
