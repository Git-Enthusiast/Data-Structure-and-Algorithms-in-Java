package com.Lec1;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Please enter two numbers: ");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            int sum = num1 + num2;
            System.out.println("Sum of two numbers is : " + sum);
        } catch (Exception e) {
           System.out.println("Invalid input. Please enter valid integers.");
        }
    }
}
