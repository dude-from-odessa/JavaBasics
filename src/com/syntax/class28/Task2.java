package com.syntax.class28;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {

    /*
Create an arrayList of cars and retrieve all the values using 3 different ways
 */

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();
        cars.add("Togg");
        cars.add("Audi S5");
        cars.add("Tesla x");
        cars.add("Toyota Gande");

        for (String car : cars) {
            System.out.println(car);      // Best way to print things
        }
        System.out.println("*******************************");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        System.out.println("*******************************");
        System.out.println(cars);
        System.out.println("*******************************");
        Iterator iterator = cars.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("*******************************");

        cars.forEach(System.out::println);    // lambda expression

    }
}
