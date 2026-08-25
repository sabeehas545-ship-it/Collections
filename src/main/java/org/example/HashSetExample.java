package org.example;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {

        Set<String> fruits = new HashSet<>();

        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Guava");
        fruits.add("Banana");

        System.out.println(fruits);
    }
}
