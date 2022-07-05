package com.syntax.class25.home_work_marks;



public class Test {

    public static void main(String[] args) {
        A student1 = new A(80, 85, 90);
        System.out.println("Average of marks obtained in three subjects by student A : "+student1.getAverage());
        B student2 = new B(80,70,60,40);
        System.out.println("Average of marks obtained in four subjects by student B : "+(student2.getAverage()));
    }
}
