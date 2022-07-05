package com.syntax.class26;

import java.util.ArrayList;

public class HomeWorkCars {
    public static void main(String[] args) {

        /*
        Create an arraylist of cars and retrieve all the values using 3 different ways.
        Create an arrayList of words. Remove every word that ends with “e”.
        Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
        Create an arrayList of even numbers from 1 to 500. Remove any number that is divisible by 5 from that arrayList.
        */

        ArrayList<String> cars = new ArrayList<>();

        cars.add("BMW");
        cars.add("Toyota");
        cars.add("Hyundai");
        cars.add("Mazda");
        cars.add("Volvo");

        for (int i = 0; i < cars.size(); i++) {
            System.out.print(cars.get(i) + " ");
        }
        System.out.println();
        System.out.println("========================================");
        System.out.println(cars);

        ArrayList<String> words = new ArrayList<>();
        words.add("goat");
        words.add("strange");
        words.add("evoke");
        words.add("nest");
        words.add("twilight");
        System.out.println(words);

        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).endsWith("e")) {
                words.remove(i);
                i--;
            }
        }
        System.out.println(words);
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Milk");
        drinks.add("Beer");
        drinks.add("Wine");
        drinks.add("Juice");
        drinks.add("Mojito");
        System.out.println(drinks);

        for (int i = 0; i < drinks.size(); i++) {
            if (drinks.get(i).contains("a") || drinks.get(i).contains("e")) {
                drinks.remove(i);
                drinks.add(i, "Water");
            }
        }
        System.out.println(drinks);

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 500; i++) {
            if(i%2==0){
                numbers.add(i);
            }
        }
        for(int i = 0; i<numbers.size();i++){
            if(numbers.get(i)%5==0){
                numbers.remove(i);
                i--;
            }
        }
        System.out.println(numbers);
    }
}
