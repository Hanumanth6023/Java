package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void show(){
        List<String> list = new ArrayList<>();
       // Collections.addAll(list);
        list.add("a");
        list.add("b");
        list.add("c");

        System.out.println(list);
        System.out.println("Now add to list");
        list.add(0,"!");
        System.out.println(list);

        System.out.println("now set ");
        list.set(0,"x");
        System.out.println(list);

        list.remove(0);
        System.out.println((list));
        System.out.println(list.indexOf("a"));

        list.add("a");
        System.out.println(list.lastIndexOf("a"));

        System.out.println(list.subList(0,2));//0-inclusive 1-Exclusive ex:[1,2,3,4] it prints 1,2 only

    }
}
