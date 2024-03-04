package com.Practice.Functions;

import java.util.Scanner;

public class MaxAndMin {

    // Method to find the maximum of three numbers
    public static int findMax(int num1, int num2, int num3) {
        return Math.max(num1, Math.max(num2, num3));
    }

    // Method to find the minimum of three numbers
    public static int findMin(int num1, int num2, int num3) {
        return Math.min(num1, Math.min(num2, num3));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.println("Enter three numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        // Find and print maximum and minimum values
        int max = findMax(num1, num2, num3);
        int min = findMin(num1, num2, num3);
        System.out.println("Maximum of the three numbers: " + max);
        System.out.println("Minimum of the three numbers: " + min);

        scanner.close();
    }
}

