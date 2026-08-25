package org.example;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

    public static void main(String[] args) {

        Set<String> countries = new LinkedHashSet<>();

        countries.add("India");
        countries.add("China");
        countries.add("USA");
        countries.add("India");

        System.out.println(countries);
    }
}
