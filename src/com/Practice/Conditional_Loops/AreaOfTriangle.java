package com.Practice.Conditional_Loops;

import java.util.Scanner;

/*
Area of Triangle.
 */
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter '1' If you want to find the area of Triangle with Base and Height, ");
        System.out.println("Or Please Enter '0' If you want to find the area of Triangle with Three sides of the triangle. ");
        int check = input.nextInt();
        if (check == 0) {
            calcAreaWithSidesOfTriangle();
        } else if (check == 1) {
            calcAreaWithBaseAndHeight();
        } else {
            System.out.println("Invalid Input, Please Run the Program again.");
        }
    }

    static void calcAreaWithBaseAndHeight() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the value of Base and Height respectively:");
        System.out.print("Base = ");
        double base = input.nextDouble();
        System.out.print("Height = ");
        double height = input.nextDouble();
        double area = (base * height) / 2;
        System.out.println("The area of Triangle whose base " + base + " and height " + height + " is equal to: " + area + " unit².");
    }

    static void calcAreaWithSidesOfTriangle() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the value of Three sides respectively: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        // Check if the sides form a valid triangle
        if (isValidTriangle(a, b, c)) {
            double s = (a + b + c) / 2;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.println("The area of the Triangle whose sides are " + a + ", " + b + ", " + c + ", is equal to : " + area + " unit².");
        } else {
            System.out.println("Invalid input. The given sides do not form a valid triangle.");
        }
    }

    static boolean isValidTriangle(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }
}

