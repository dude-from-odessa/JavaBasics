package com.syntax.class28.home_work;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class HomeWork3 {

    public static void main(String[] args) {

        /*
        Create a Set of cities in which you want to make sure that insertion order is maintained.
        Then remove any city that starts with “A”;
         */
        LinkedHashSet<String> cities = new LinkedHashSet<>();
        cities.add("Kiev");
        cities.add("London");
        cities.add("Warsaw");
        cities.add("Berlin");
        cities.add("Paris");
        cities.add("Tallinn");
        cities.add("Athens");
        cities.add("Oslo");
        cities.add("Amsterdam");
        cities.add("Madrid");

        /*               < Using Iterator >
        Iterator<String> iterator = cities.iterator();
        while(iterator.hasNext()){
            if(iterator.next().toLowerCase().startsWith("a")){
                iterator.remove();
            }
        }
         */
        cities.removeIf(s -> s.toLowerCase().startsWith("a"));
        System.out.println(cities);

    }
}
