package com.Practice.Functions;

/*
Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.


 */
import java.util.Scanner;

public class circumferenceAndAreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the Value of Radius" +
                " to Calculate Circumference And Area of the circle");
        float radius = input.nextFloat();
        calculateCircumference(radius);
        calculateArea(radius);
    }

    private static void calculateArea(float radius) {
        System.out.println("The Area of the Circle is : "+(Math.PI*Math.pow(radius,2))+" UnitSq.");
    }

    private static void calculateCircumference(float radius) {
        System.out.println("The circumference of the Circle is: "+(2*Math.PI*radius)+" Unit.");
    }
}
