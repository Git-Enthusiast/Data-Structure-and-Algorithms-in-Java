package com.Practice.Conditional_Loops;

import java.util.Scanner;

/*
To find area of Equilateral Triangle.
 */
public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the side of the Equilateral Triangle (only Once): ");
        double sides = input.nextDouble();
        calcAreaOfEquilateralTriangle(sides);
    }
    static  void calcAreaOfEquilateralTriangle(double sides){
        // Area of an Equilateral Triangle = A = (√3)/4 × side2.
        double area = ((Math.sqrt(3))/4)*Math.pow(sides,2);
        System.out.println("The area of Equilateral Triangle is "+area);
    }
}
