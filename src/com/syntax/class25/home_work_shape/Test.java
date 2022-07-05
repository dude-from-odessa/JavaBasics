package com.syntax.class25.home_work_shape;

class Test{

    public static void main(String[] args) {
        Square square = new Square();
        System.out.println("Area of square is : "+square.calculateArea(20));
        System.out.println("Perimeter of square is : "+square.calculatePerimeter(20));
        Circle circle = new Circle();
        System.out.println("Area of circle is : "+circle.calculateArea(15));
        System.out.println("Perimeter of circle is : "+circle.calculatePerimeter(15));
    }
}
