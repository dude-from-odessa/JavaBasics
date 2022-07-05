package com.syntax.class25.home_work_shape;

class Circle implements Shape {

    @Override
    public void calculateArea() {

    }

    public double calculateArea(double radius) {

        return Math.PI * radius * radius;
    }

    @Override
    public void calculatePerimeter() {

    }

    public double calculatePerimeter(double radius) {

        return Math.PI * 2 * radius;
    }
}
