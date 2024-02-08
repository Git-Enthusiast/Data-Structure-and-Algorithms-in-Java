package com.Practice.Conditional_Loops;

import java.util.Scanner;

/*
Area of Triangle.
 */
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the value of Base and Height respectively:");
        System.out.print("Base = ");
        double base = input.nextDouble();
        System.out.print("Height = ");
        double height = input.nextDouble();
        calcArea(base,height);
    }
    static void calcArea(double base,double height){
        double area = (base*height)/2;
        System.out.println("The area of Triangle whose base "+(int)base+" and height "+(int)height+" is equal to: "+area+" unit².");
    }
}
