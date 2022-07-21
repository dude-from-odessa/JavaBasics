package com.syntax.class29.home_work;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HomeWork3 {

    /*
Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
Retrieve all keys and values from a Best Buy map using EntrySet.
     */

    public static void main(String[] args) {

        HashMap<Integer, String> bestBuyStore = new HashMap<>();
        bestBuyStore.put(7664847,"Printer");
        bestBuyStore.put(7879885,"TV");
        bestBuyStore.put(4564,"Playstation 5");
        bestBuyStore.put(48390,"Coffee Machine");
        bestBuyStore.put(43499,"Notebook");
        bestBuyStore.put(90034,"Fridge");

        Set<Map.Entry<Integer,String>> entries = bestBuyStore.entrySet();
        System.out.println(entries);
        Iterator<Map.Entry<Integer,String>> iterator = entries.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
