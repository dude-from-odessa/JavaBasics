package com.syntax.class29.home_work;

import java.util.*;

public class HomeWork5 {

    /*
    Create a Map that will store Employee name and salary.
    Write a logic to retrieve an employee who gets the highest salary.
    Output should be in the below format
    John Smith=$100000
     */
    public static void main(String[] args) {

        HashMap<String,Double> employee = new HashMap<>();
        employee.put("Gennadiy Babayev",4000.0);
        employee.put("Johnny Depp",2000000.0);
        employee.put("Cate Blanchett",1000000.0);
        employee.put("Natalie Portman",300000.0);
        Double maxValue = 0.0;
        String keyMaxValue = "";
        Set<Map.Entry<String,Double>> entries = employee.entrySet();
        Iterator<Map.Entry<String,Double>> iterator = entries.iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Double> it = iterator.next();
            if(it.getValue()>maxValue){
                maxValue= it.getValue();
                keyMaxValue= it.getKey();
            }
        }
        System.out.println(keyMaxValue+"=$"+maxValue);
    }
}
