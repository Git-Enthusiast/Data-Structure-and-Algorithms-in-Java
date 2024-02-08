package com.Practice.Conditional_Loops;

import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the value of length of side of the Triangle to calculate its Perimeter:");
        double lengthOfSide = input.nextDouble();
        calcPerimeter(lengthOfSide);
    }
    static void calcPerimeter(double lengthOfSide){
        double perimeter = 3*lengthOfSide;
        System.out.println("The perimeter of the Equilateral Triangle is: "+perimeter+" unit.");
    }
}
