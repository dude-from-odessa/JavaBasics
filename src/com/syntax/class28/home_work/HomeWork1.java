package com.syntax.class28.home_work;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HomeWork1 {
    public static void main(String[] args) {

        /*
        How can you remove all duplicates from ArrayList?
         */

        List<String> aList = new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");


       List<String> alist= new ArrayList<>(new HashSet<>(aList));
        System.out.println(alist);

    }
}
