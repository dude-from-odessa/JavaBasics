package com.syntax.class25.home_work_marks;

public class B extends Marks {


    public B(double subject1, double subject2, double subject3, double subject4) {

        super.subject1 = subject1;
        super.subject2 = subject2;
        super.subject3 = subject3;
        super.subject4 = subject4;

    }

    @Override
    double getAverage() {

        return (subject1 + subject2 + subject3 + subject4) / 4;

    }
}
