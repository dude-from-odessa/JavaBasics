package com.syntax.class25.home_work_marks;

public class A extends Marks {


    double subject1;
    double subject2;
    double subject3;

    public A(double subject1, double subject2, double subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    @Override
    double getAverage() {

        return (subject1 + subject2 + subject3) / 3;

    }
}
