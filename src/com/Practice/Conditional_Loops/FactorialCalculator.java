package com.Practice.Conditional_Loops;

import java.util.Scanner;
public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose a method to calculate factorial:");
        System.out.println("1. Recursion");
        System.out.println("2. Loop");
        int choice = input.nextInt();

        System.out.println("Please Enter the value of number to calculate its factorial: ");
        int n = input.nextInt();

        long factorial;

        switch (choice) {
            case 1:
                factorial = calculateFactorialRecursive(n);
                System.out.println("Factorial using Recursion: " + factorial);
                break;
            case 2:
                factorial = calculateFactorialLoop(n);
                System.out.println("Factorial using Loop: " + factorial);
                break;
            default:
                System.out.println("Invalid choice. Please choose 1 or 2.");
        }
    }

    // Recursive method to calculate factorial
    private static long calculateFactorialRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case: 0! and 1! are both 1
        } else {
            return n * calculateFactorialRecursive(n - 1); // Recursive case
        }
    }

    // Loop method to calculate factorial
    private static long calculateFactorialLoop(int n) {
        long factorial = 1;

        while (n > 0) {
            factorial *= n;
            n--;
        }

        return factorial;
    }
}

