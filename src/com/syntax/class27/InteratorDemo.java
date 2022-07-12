package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InteratorDemo {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Bro");
        names.add("Abdul");
        names.add("Mumtaz");
        names.add("Zameer");
        names.add("Cindy");
        /*
// those operations which can change the size of collection are not
        // allowed to be used inside loops
        for(String name : names){
            names.remove(name);
        }
        */
        Iterator<String> interator = names.iterator();
        while(interator.hasNext()){
            System.out.println(interator.next());
        }
    }
}
