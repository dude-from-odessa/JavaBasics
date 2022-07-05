package com.syntax.class25.home_work_shape;

class Square implements Shape {

    @Override
    public void calculateArea() {

    }

    public double calculateArea(double side) {

        return side * side;
    }

    @Override
    public void calculatePerimeter() {

    }

    public double calculatePerimeter(double side) {

        return 4 * side;
    }
}
