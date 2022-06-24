package com.syntax.review08;

public class AnotherHospital {

    public static void main(String[] args) {

        Doctor doc = new Doctor("Sherlock", "Holmes", "Magic",10);
    doc.printInfo();   // access to public
    doc.treat("Samantha");  // access to default
    doc.work(); // access to protected
        Doctor.study("GW"); // access to public
    }
}
