package com.syntax.class21;

import java.sql.SQLOutput;

public class HomeWork1 {

    /*
    Create 1 class in which create a methods that will calculate the area (volume in case of box) of
Rectangle
Square
Box
Use separate class to test your code
     */


    static double areaSquare(double width) {
        double areaSquare;
        areaSquare= width * width;
        return areaSquare;
    }
    static double areaRectangle(double width, double height) {
        double areaRectangle;
        areaRectangle = width * height;
        return areaRectangle;
    }
    static double volumeBox(double width, double height, double length){
        double volumeBox;
        volumeBox=width*height*length;
        return volumeBox;
    }
}

class Test{
    public static void main(String[] args) {

        System.out.println(HomeWork1.areaSquare(4));
        System.out.println(HomeWork1.areaRectangle(4,5));
        System.out.println(HomeWork1.volumeBox(4,5,6));

    }
}
