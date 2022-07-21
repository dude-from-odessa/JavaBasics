package com.syntax.class29;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo4 {
    public static void main(String[] args) {
        HashMap<String, Double> fruit = new HashMap<>();
        fruit.put("Apple", 20000.0); //auto upcasting does not work with wrappers
        fruit.put("Orange", 20.5);
        fruit.put("Kiwi", 10.2);
        fruit.put("Banana", 50.5);
        fruit.put("Apple", 10.5);

       Set<Map.Entry<String,Double>> entries = fruit.entrySet();
        System.out.println(entries);  //[Apple=10.5, Kiwi=10.2, Orange=20.5, Banana=50.5]

       for(Map.Entry<String,Double> entry : entries) {
           System.out.println("entry = "+entry);
           /*
                     entry = Apple=10.5
                     entry = Kiwi=10.2
                     entry = Orange=20.5
                     entry = Banana=50.5
            */
       }
    }
}
