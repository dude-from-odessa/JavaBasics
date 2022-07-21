package com.syntax.class29.home_work;

import java.util.*;

public class HomeWork2 {

    /*
Create a map of countries with its capital that will store countries in alphabetical order.
Print all keys and values from a country map using for each loop and iterator.
Print all values from a country map using for each loop and iterator.
     */

    public static void main(String[] args) {
        TreeMap<String, String> countriesCapitals = new TreeMap<>();
        countriesCapitals.put("Maldives", "Male");
        countriesCapitals.put("Mexico","Mexico City");
        countriesCapitals.put("France","Paris");
        countriesCapitals.put("Ukraine", "Kyiv");
        countriesCapitals.put("Ethiopia", "Addis Ababa");
        countriesCapitals.put("Netherlands","Amsterdam");
        countriesCapitals.put("Gibraltar","Gibraltar");
        countriesCapitals.put("Portugal","Lisbon");
        countriesCapitals.put("Togo","Lome");
        countriesCapitals.put("United Kingdom","London");
        countriesCapitals.put("Angola","Luanda");
        countriesCapitals.put("Saint Martin","Marigot");
        countriesCapitals.put("Comoros","Moroni");
        countriesCapitals.put("Norway","Oslo");
        countriesCapitals.put("South Africa","Cape Town");
        countriesCapitals.put("Italy","Rome");
        countriesCapitals.put("Singapore","Singapore");
        countriesCapitals.put("Sri Lanka","Colombo");
        countriesCapitals.put("Vatican City","Vatican City");
        countriesCapitals.put("Austria","Vienna");
        countriesCapitals.put("Curacao","Willemstad");

        Set<Map.Entry<String, String>> entries = countriesCapitals.entrySet();
        Iterator<Map.Entry<String, String>> iterator =entries.iterator();
        System.out.println("============ Iterator Keys & Values =============");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("========== For Each Loop Keys & Values ==========");
        for(Map.Entry<String, String> entry : entries){
            System.out.println(entry);
        }
        System.out.println("============ Iterator Values =============");
       Collection<String> valuesCountries =  countriesCapitals.values();

        Iterator<String> iterator1 = valuesCountries.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
        System.out.println("========== For Each Loop Values ==========");
        for(String str : valuesCountries){
            System.out.println(str);
        }
    }
}
