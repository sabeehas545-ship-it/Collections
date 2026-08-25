package org.example;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapExample {

    public static void main(String[] args) {

        HashMap<Integer, String> empMap = new LinkedHashMap<>();

        empMap.put(100, "Vinod");
        empMap.put(101, "Suresh");
        empMap.put(102, "Mahesh");
        empMap.put(103, "Naresh");
        empMap.put(104, "Sunny");
        empMap.put(105, "Vinod");

        System.out.println("LinkedHashMap:" +empMap);

//duplicate keys are not allowed
//duplicate values are allowed
//insertion order is preserved

    }
}
