package org.example.coreconcepts;

public class PrimeNumber {
    public static void main(String[] args) {

        int number = 29;
        boolean prime = true;

        if (number < 2) {
            prime = false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                prime = false;
                break;
            }
        }

        System.out.println(prime ? "Prime" : "Not Prime");
    }
}