package com.Practice.Conditional_Loops;

import java.util.Scanner;

/*
To find area of Rhombus
 */
public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter '1' If you want to find the area of Rhombus with Base and Height, ");
        System.out.println("Or Please Enter '0' If you want to find the area of Rhombus with Two Diagonals. ");
        int check = input.nextInt();
        if (check == 0) {
            calcAreaWithDiagonals();
        } else if (check == 1) {
            calcAreaWithBaseAndHeight();
        } else {
            System.out.println("Invalid Input, Please Run the Program again.");
        }
    }
    static void calcAreaWithBaseAndHeight(){
        // Area of a Rhombus = A = b × h
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the value of Base and Height of the Parallelogram respectively:");
        System.out.print("Base = ");
        double base = input.nextDouble();
        System.out.print("Height = ");
        double height = input.nextDouble();
        double area = (base * height);
        System.out.println("The area of Parallelogram whose base " + base + " and height " + height + " is equal to: " + area + " unit².");
    }
    static void calcAreaWithDiagonals(){
        // Area of a Rhombus = A = ½ × d1 × d2
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the value of Diagonal1 and Diagonal2 of the Parallelogram respectively:");
        System.out.print("Diagonal1 = ");
        double diagonal1 = input.nextDouble();
        System.out.print("Diagonal2 = ");
        double diagonal2 = input.nextDouble();
        double area = (diagonal1 * diagonal2)/2;
        System.out.println("The area of Parallelogram whose Diagonal1 " + diagonal1 + " and Diagonal2 " + diagonal2 + " is equal to: " + area + " unit².");
    }
}
