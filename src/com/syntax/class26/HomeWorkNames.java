package com.syntax.class26;


import java.util.ArrayList;

public class HomeWorkNames {

    public static void main(String[] args) {

        /*
        Create an ArrayList that will store 5 names into it.
Find out whether the given ArrayList is empty or not?
Check whether the specific name is present in an ArrayList or not?
Find the size of your arrayList and print all values from that

Create an arraylist of cars and retrieve all the values using 3 different ways.
Create an arrayList of words. Remove every word that ends with “e”.
Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
Create an arrayList of even numbers from 1 to 500. Remove any number that is divisible by 5 from that arrayList.
         */

        ArrayList<String> names = new ArrayList<>();
        names.add("Olivia");
        names.add("Emma");
        names.add("Charlotte");
        names.add("Amelia");
        names.add("Oliver");
        if(names.isEmpty()){
            System.out.println("Array List is empty");
        } else {
            System.out.println("Array List is not empty");
        }
        if(names.contains("Gennadiy")) {
            System.out.println("Array List contains name Gennadiy");
        } else {
            System.out.println("Array List does not contain name Gennadiy");
        }
        System.out.println("Size of array list is : "+names.size());
        System.out.println("Array list : "+names);

    }



}
