package com.syntax.class28.home_work;

import java.util.Iterator;
import java.util.TreeSet;

public class HomeWork2 {

    public static void main(String[] args) {

        /*
        Create a Set collection in which you need to add names of the countries.
        In this set we want all objects to be sorted in alphabetical order.
        Using 2 different ways retrieve all elements from set.
         */

        TreeSet<String> countries = new TreeSet<>();
        countries.add("Ukraine");
        countries.add("Bulgaria");
        countries.add("USA");
        countries.add("Germany");
        countries.add("Canada");
        countries.add("Mexico");
        countries.add("Greece");
        countries.add("Netherlands");
        countries.add("Switzerland");
        countries.add("Austria");

        // First way
        Iterator<String> iterator = countries.iterator();

        while(iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
        System.out.println("=========================================");
        // Second way
        for(String x : countries) {
            System.out.print(x+" ");
        }

    }
}
