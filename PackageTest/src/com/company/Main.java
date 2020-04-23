package com.company;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i <= 16; i++) {

            System.out.println("Sum: " + Series.nSum(i));
        }

        for (int i = 0; i <= 16; i++) {

            System.out.println("Factorial: " + Series.factorial(i));
        }

        for (int i = 0; i <= 16; i++) {

            System.out.println("Fibonacci: " + Series.fibonacci(i));
        }
    }
}
