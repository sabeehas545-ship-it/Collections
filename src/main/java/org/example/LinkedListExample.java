package org.example;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

    public static void main(String[] args) {

        List<String> names = new LinkedList<>();

        names.add("Sabeeha");
        names.add("Arqam");
        names.add("Hamdaan");

        names.add(2, "Sam");

        System.out.println(names);
    }
}
