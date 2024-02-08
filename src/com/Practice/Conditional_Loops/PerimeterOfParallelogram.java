package com.Practice.Conditional_Loops;

import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Both the adjacent Sides of the Parallelogram respectively: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double perimeter = 2*(side1+side2);
        System.out.println("Perimeter of the Parallelogram is: "+perimeter+" unit.");
    }
}
