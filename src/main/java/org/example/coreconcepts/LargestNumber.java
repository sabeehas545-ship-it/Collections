package org.example.coreconcepts;

public class LargestNumber {
    public static void main(String[] args) {

        int[] numbers = {10, 45, 23, 89, 12};

        int largest = numbers[0];

        for (int number : numbers) {

            if (number > largest) {
                largest = number;
            }
        }

        System.out.println("Largest: " + largest);
    }
}