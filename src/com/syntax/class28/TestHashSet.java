package com.syntax.class28;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {
    public static void main(String[] args) {

        HashSet<String> hset = new HashSet<String>();

// Adding elements to the HashSet
        hset.add("Apple");
        hset.add("Mango");
        hset.add("Grapes");
        hset.add("Orange");
        hset.add("Fig");
//Addition of duplicate elements
        hset.add("Apple");
        hset.add("Mango");
//Addition of null values
        hset.add(null);
        hset.add(null);
//Displaying HashSet elements
        System.out.println(hset);

        // Create a HashSet
        HashSet<String> hset1 = new HashSet<>();
//add elements to HashSet
        hset1.add("Chaitanya");
        hset1.add("Rahul");
        hset1.add("Tim");
        hset1.add("Rick");
        hset1.add("Harry");
        Iterator<String> it = hset1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}


