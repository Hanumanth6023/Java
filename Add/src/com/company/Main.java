package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        // Collections.addAll(list);
        list1.add("shoes");
        list1.add("socks");
        list1.add("belt");
        System.out.println("list1 elements are : " +  list1);

        List<String> list2 = new ArrayList<>();
        // Collections.addAll(list);
        list2.add("a");
        list2.add("c");
        list2.add("d");

        System.out.println("list 2 elements : " +  list2);

        List<String> result = new ArrayList<>();
        result.addAll(list1);
        result.addAll(list2);
        System.out.println("Final List elements :" +  result);



    }
}
