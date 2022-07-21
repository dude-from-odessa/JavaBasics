package com.syntax.class29;

import java.util.HashMap;

public class MapDemo1 {
    public static void main(String[] args) {

        HashMap<String, Double> fruit = new HashMap<>();
        fruit.put("Apple",20000.0); //auto upcasting does not work with wrappers
        fruit.put("Orange",20.5);
        fruit.put("Kiwi",10.2);
        fruit.put("Banana",50.5);
        fruit.put("Apple",10.5);
        System.out.println(fruit);                          // {Apple=10.5, Kiwi=10.2, Orange=20.5, Banana=50.5}
        System.out.println(fruit.get("Kiwi"));              // 10.2
        System.out.println(fruit.remove("Orange"));     // 20.5
        System.out.println(fruit);                          // {Apple=10.5, Kiwi=10.2, Banana=50.5}
        System.out.println(fruit.containsKey("Kiwi"));      // true
        System.out.println(fruit.containsValue(10.2));      // true
        System.out.println(fruit.isEmpty());                // false
        fruit.replace("Kiwi",15.2);
        System.out.println(fruit);   // {Apple=10.5, Kiwi=15.2, Banana=50.5}
      //  fruit.put(null,null);
        System.out.println(fruit);   // {Apple=10.5, Kiwi=15.2, Banana=50.5}

    }
}
