package org.example.coreconcepts;

public class Factorial {
    public static void main(String[] args) {

        int number = 5;
        int factorial = 1;

        for (int i = 1; i <= number; i++) {

            factorial *= i;  // 5! = 5*4*3*2*1 = 120
                            //factorial = factorial * i
        }

        System.out.println(factorial);
    }
}