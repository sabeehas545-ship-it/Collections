package org.example.coreconcepts;

public class TypeCastingDemo {
    public static void main(String[] args) {

        int number = 100;

        double d = number;       // widening
        System.out.println(d);

        double price = 99.99;
        int p = (int) price;     // narrowing
        System.out.println(p);
    }
}