package com.syntax.class29.home_work;

import java.util.TreeMap;

public class HomeWork1 {

    /*
Create a map of a building.
Store floor number and it is associated company name. (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
Check how many entries you have?
Update company on a 4th floor
Remove company on the 7th floor
Print your map
     */
    public static void main(String[] args) {

        TreeMap<Integer, String> building = new TreeMap<>();
        building.put(1,"Google");
        building.put(2,"Syntax");
        building.put(3,"MSI");
        building.put(4,"Sony");
        building.put(5,"Huawei");
        building.put(6,"Samsung");
        building.put(7,"CD Project");
        System.out.println(building.size());
        System.out.println(building);
        building.put(4,"Nokia");
        System.out.println(building);
        building.remove(7);
        System.out.println(building);
    }
}
