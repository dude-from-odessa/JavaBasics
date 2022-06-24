package com.syntax.review08;

public class Hospital {
    public static void main(String[] args) {
        Doctor doc = new Doctor("Jane", "Smith");
        doc.printInfo();
        Doctor.hospital = "UCSF";
        doc.work();

        System.out.println("----------------------");
        // creating another doctor
        Doctor doctor = new Doctor("Joe", "Doe", "cardiologist", 10);
        doctor.printInfo();
        doctor.work();
// changing value of static variable
        Doctor.hospital = "George Washington";
        doc.work();
        doctor.work();
        doc.lastName = "Obama";
        doc.printInfo();
        doctor.printInfo();
        doc.hospital = "Mayo Clinic";    // not good way. need to use class name.

        System.out.println();
        doc.work();
        doctor.work();

        doctor.treat("Samantha");

        //accessing static method
        Doctor.study("GTU");
    }
}
