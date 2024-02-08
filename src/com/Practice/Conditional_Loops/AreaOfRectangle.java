package com.Practice.Conditional_Loops;

import java.util.Scanner;

/*
To find Area of Rectangle
 */
public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the value of length and breadth: ");
        System.out.print("Length = ");
        double length = input.nextDouble();
        System.out.print("Breadth = ");
        double breadth = input.nextDouble();
        calcArea(length,breadth);
    }
    static void calcArea(double length,double breadth){
        double area = (length*breadth);
        System.out.println("The area of Triangle whose length "+length+" and breadth "+breadth+" is equal to: "+area+" unit².");
    }
}
