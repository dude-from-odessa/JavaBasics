package com.syntax.class16;

public class Students {

    String name;
    int id;
    static int numberOfStudents=0;

    void info() {
        System.out.println("Student "+name+" has id : "+id+". Total amount of students is : "+numberOfStudents);
    }


    public static void main(String[] args) {

        /*
        Create a Class called Students
        Create three  variables  Name , ID  and  numberOfStudents
        Create three objects of the Students Class
        Set the value for  studentName , studentID and increment  the numberOfStudents for each object
        Print out  total number of students
         */

        Students student1 = new Students();
        numberOfStudents++;
        student1.name="Garry";
        student1.id=50;
        student1.info();
        Students student2 = new Students();
        numberOfStudents++;
        student2.name="Sponge Bob";
        student2.id=51;
        student2.info();
        Students student3 = new Students();
        numberOfStudents++;
        student3.name="Patric";
        student3.id=52;
        student3.info();
    }
}
