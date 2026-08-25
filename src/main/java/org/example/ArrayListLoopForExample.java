package org.example;

import java.util.ArrayList;
import java.util.List;

public class ArrayListLoopForExample {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("allen");
        names.add("Reed");
        names.add("Marie");

        for(int i = 0; i < names.size(); i++){

            System.out.println("Names:" +names.get(i));

        }
    }
}
