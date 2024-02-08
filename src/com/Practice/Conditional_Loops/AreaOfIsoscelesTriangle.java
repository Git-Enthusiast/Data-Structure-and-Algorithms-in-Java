package com.Practice.Conditional_Loops;

import java.util.Scanner;

/*
To find the area of Isosceles Triangle.
 */
public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        System.out.println("Please Enter the equal sides (only once): ");
        Scanner input = new Scanner(System.in);
        double equalSides = input.nextDouble();
        System.out.println("Please Enter the Unequal side of the triangle:");
        double unequalSide = input.nextDouble();
        calcAreaIsosceles(equalSides, unequalSide);
    }

    // By using two equal sides and one unequal side.
    // Area of Isosceles Triangle Using Only Sides = ½[√(a2 − b2 /4) × b], where a is two equal sides and b is one unequal side.
    static void calcAreaIsosceles(double equalSides, double unequalSide) {
        double area = (unequalSide * Math.sqrt((Math.pow(equalSides, 2) - (Math.pow(unequalSide, 2) / 4)))) / 2;
        System.out.println("The area of the Isosceles Triangle is: " + area);
    }
}

