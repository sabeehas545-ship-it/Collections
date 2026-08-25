package org.example;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {

        Set<Integer> numbers = new TreeSet<>();

        // arranges the numbers in a sorted order
        numbers.add(50);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(10);

        System.out.println(numbers);
    }
}