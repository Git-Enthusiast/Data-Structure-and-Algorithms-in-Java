package com.JavaLab;

/*
Sum of 5 and 10 is: 15
Sum of 5, 10, and 15 is: 30
Sum of 5.5 and 10.5 is: 16.0
Sum of 5.5, 10.5, and 15.5 is: 31.5
 */
public class MethodOverloadingExample {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Method to add three doubles
    public double add(double a, double b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        MethodOverloadingExample obj = new MethodOverloadingExample();

        // Calling methods with different parameters
        System.out.println("Sum of 5 and 10 is: " + obj.add(5, 10));
        System.out.println("Sum of 5, 10, and 15 is: " + obj.add(5, 10, 15));
        System.out.println("Sum of 5.5 and 10.5 is: " + obj.add(5.5, 10.5));
        System.out.println("Sum of 5.5, 10.5, and 15.5 is: " + obj.add(5.5, 10.5, 15.5));
    }
}
