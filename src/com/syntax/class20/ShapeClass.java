package com.syntax.class20;

import static java.lang.Math.PI;

public class ShapeClass {

    /*
    Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
    In circle class create a method to calculate the area of circle. Test your code
     */

    double radius;

    ShapeClass(double radius) {
        this.radius = radius;
    }
}

class CircleClass extends ShapeClass {

    CircleClass(double radius) {
        super(radius);
    }

    double area() {
        double area = Math.PI * radius * radius;

        return area;
    }

}

class Main {
    public static void main(String[] args) {

        CircleClass circle = new CircleClass(3);
        System.out.println(circle.area());
    }
}
