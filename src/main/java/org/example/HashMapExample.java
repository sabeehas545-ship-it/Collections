package org.example;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {

        Map<Integer, String> employees = new HashMap<>();

        employees.put(101, "Sabeeha");
        employees.put(102, "John");
        employees.put(103, "Mary");

        System.out.println(employees);

        System.out.println("Employee 102: " + employees.get(102));

        employees.remove(103);

        System.out.println(employees);
    }
}