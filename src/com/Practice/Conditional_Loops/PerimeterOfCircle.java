package com.Practice.Conditional_Loops;

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the value of radius of the circle to calculate its Perimeter:");
        double radius = input.nextDouble();
        calcPerimeter(radius);

    }

    private static void calcPerimeter(double radius) {
        double perimeter = 2*Math.PI*radius;
        System.out.println("The Perimeter of the Circle whose radius is "+radius+" will be "+perimeter+" unit.");
    }
}
