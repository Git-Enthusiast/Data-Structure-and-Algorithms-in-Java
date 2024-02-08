package com.Practice.Conditional_Loops;

import java.util.Scanner;

/*
To find Area Of Parallelogram
 */
public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter '1' If you want to find the area of Parallelogram with Base and Height, ");
        System.out.println("Or Please Enter '0' If you want to find the area of Parallelogram with Two adjacent sides and angle between them. ");
        int check = input.nextInt();
        if (check == 0) {
            calcAreaWithAdjacentSidesAndAngle();
        } else if (check == 1) {
            calcAreaWithBaseAndHeight();
        } else {
            System.out.println("Invalid Input, Please Run the Program again.");
        }
    }
    static void calcAreaWithBaseAndHeight(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the value of Base and Height of the Parallelogram respectively:");
        System.out.print("Base = ");
        double base = input.nextDouble();
        System.out.print("Height = ");
        double height = input.nextDouble();
        double area = (base * height);
        System.out.println("The area of Parallelogram whose base " + base + " and height " + height + " is equal to: " + area + " unit².");
    }
    static void calcAreaWithAdjacentSidesAndAngle(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Both the adjacent Sides of the Parallelogram respectively: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        System.out.println("Please Enter the Angle between the adjacent side: ");
        double degrees = input.nextDouble();
        double radians = Math.toRadians(degrees);
        double area = side1*side2*Math.sin(radians);
        System.out.println("Area of the Parallelogram is: "+area+" unit².");


    }
}
