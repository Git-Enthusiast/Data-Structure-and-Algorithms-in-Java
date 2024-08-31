package com.Lec2;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = in.nextInt();

        // Input validation
        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else if (n == 1) {
            System.out.println("The 1st Fibonacci number is: 0");
        } else if (n == 2) {
            System.out.println("The 2nd Fibonacci number is: 1");
        } else {
            int p = 0; // previous Fibonacci number (F0)
            int c = 1; // current Fibonacci number (F1)
            int count = 2;

            // Calculate the nth Fibonacci number
            while (count < n) {  // We use '<' because we start with the 2nd count
                int temp = c;
                c = c + p;
                p = temp;
                count++;
            }

            System.out.println("The " + n + "th Fibonacci number is: " + c);
        }

        in.close(); // Close the scanner object
    }
}

