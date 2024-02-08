package com.Practice.Conditional_Loops;

import java.util.Scanner;

/*
Area Of Circle Java Program
 */
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the value of radius of the circle to calculate its area:");
        double radius = input.nextDouble();
        calcArea(radius);

    }
    static void calcArea(double radius){
        double ans = (Math.PI*Math.pow(radius,2));
        System.out.println("The area of the Circle whose radius is "+radius+" will be "+ans+" unit².");
    }
}
