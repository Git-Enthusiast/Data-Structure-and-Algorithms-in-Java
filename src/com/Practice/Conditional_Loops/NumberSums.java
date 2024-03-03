package com.Practice.Conditional_Loops;

import java.util.Scanner;

public class NumberSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables to store sums
        int sumNegative = 0;
        int sumPositiveEven = 0;
        int sumPositiveOdd = 0;

        // Input loop
        System.out.println("Enter numbers (terminate with 0):");
        while (true) {
            int num = scanner.nextInt();

            // Check if the number is zero to terminate the loop
            if (num == 0) {
                break;
            }

            // Check number's sign and add it to the respective sum
            if (num < 0) {
                sumNegative += num;
            } else {
                if (num % 2 == 0) {
                    sumPositiveEven += num;
                } else {
                    sumPositiveOdd += num;
                }
            }
        }
        scanner.close();

        // Output the sums
        System.out.println("Sum of negative numbers: " + sumNegative);
        System.out.println("Sum of positive even numbers: " + sumPositiveEven);
        System.out.println("Sum of positive odd numbers: " + sumPositiveOdd);
    }
}
