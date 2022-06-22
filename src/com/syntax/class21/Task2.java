package com.syntax.class21;

public class Task2 {
}

class Shape {

    /*
    Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
    In circle class create a method to calculate the area of circle. Test your code
     */

    double radius; // if we have constructor with variable, we should have it as instance in our class

    Shape(double radius) {
        this.radius = radius;
    }
}

class Circle extends Shape {

    Circle(double radius) {
        super(radius);
    }

    void calculateAndPrintArea() {
        double area = Math.PI * Math.pow(radius, 2); // better use constant have more accuracy
    }
}
class Tester {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        circle.calculateAndPrintArea();
    }
}
