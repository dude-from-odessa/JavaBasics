package com.syntax.class18;

public class TaskStudent {

    /*
    Write a Student class   that have instance variables name and address.
    Create a constructor that will initialize those variables.
    Print name & address of given  student using displayInfo method
     */

    private String name;
    private String address;

    public TaskStudent(String name, String address) {

        this.name = name;
        this.address = address;

    }

    public void displayInfo() {

        System.out.println("Student " + name + " is living in " + address);

    }

    public static void main(String[] args) {

        TaskStudent student = new TaskStudent("Genndaiy", "Ukraine / Odesa ");

        student.displayInfo();
    }
}
