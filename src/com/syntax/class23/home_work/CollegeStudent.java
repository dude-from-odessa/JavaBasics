package com.syntax.class23.home_work;

public class CollegeStudent extends Student {

    CollegeStudent(String name) {
        super(name);

    }

    @Override
    public void study() {
        System.out.println("Student " + name + " is studying in College");
    }
}
