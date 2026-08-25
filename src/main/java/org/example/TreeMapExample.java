package org.example;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {

        Map<Integer, String> map = new TreeMap<>();

        map.put(102, "Wise");
        map.put(101, "Young");
        map.put(100, "Syed");
        map.put(104, "Syed");
        map.put(104, "Shaik");

        //sorted order based on key
        //duplicate values allowed
        //duplicate key was not allowed

        System.out.print("Treemap: " +map);
    }
}
