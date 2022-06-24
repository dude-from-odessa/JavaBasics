package com.syntax.review01;

import com.syntax.review08.Doctor;

public class Practice extends Doctor {

    Practice(String firstName, String lastName) {

        super(firstName, lastName);

    }

    public static void main(String[] args) {

        Practice object = new Practice("John", "Smith");
        object.printInfo();
    }
}
