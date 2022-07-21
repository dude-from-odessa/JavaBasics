package com.syntax.class29;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo2 {
    public static void main(String[] args) {

        TreeMap<String, Integer> fruit = new TreeMap<>();
        fruit.put("Apple",20);
        fruit.put("Water melon",25);
        fruit.put ("Peach",20);
        fruit.put("Strawberry",100);
        System.out.println(fruit);     // {Apple=20, Peach=20, Strawberry=100, Water melon=25}

        HashMap<String, Integer> cosmetics = new HashMap<>();
        cosmetics.put("foundation",20);
        cosmetics.put("lipstick",25);
        cosmetics.put ("mascara",20);
        cosmetics.put("Blush",100);
        System.out.println(cosmetics);  // {Blush=100, foundation=20, lipstick=25, mascara=20}

        LinkedHashMap<String, Integer> groceries = new LinkedHashMap<>();
        groceries.putAll(fruit);
        groceries.putAll(cosmetics);

        System.out.println(groceries); // {Apple=20, Blush=100, Peach=20, Strawberry=100, Water melon=25, foundation=20, lipstick=25, mascara=20}
    }
}
