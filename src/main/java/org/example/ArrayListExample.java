package org.example;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {

        List<String> namesList = new ArrayList<>();

        namesList.add("John");
        namesList.add("Sam");
        namesList.add("Arqam");

        System.out.println("List of names:" + namesList);

        System.out.println("First name:" + namesList.get(1));
    }
}
