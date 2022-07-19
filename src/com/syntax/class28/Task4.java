package com.syntax.class28;

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {

        ArrayList<String> drinks = new ArrayList<>();
drinks.add("Patti chai");
        drinks.add("Patti cha");
        drinks.add("Vodka");
        drinks.add("Whiskey");
        drinks.add("Coffe");
        drinks.add("Ayran");
        drinks.add("Milk");
        drinks.add("Margarita");

        for(int i = 0;i<drinks.size();i++) {
            if(drinks.get(i).contains("a")||drinks.get(i).contains("e")){
                drinks.set(i,"Water"); //replaced
            }
        }
        System.out.println(drinks);
    }
}
