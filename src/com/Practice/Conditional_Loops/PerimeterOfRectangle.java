package com.Practice.Conditional_Loops;

import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Both the adjacent Sides of the Rectangle respectively: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double perimeter = 2*(side1+side2);
        System.out.println("Perimeter of the Rectangle is: "+perimeter+" unit.");
    }
}
