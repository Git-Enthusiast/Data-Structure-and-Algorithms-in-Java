package com.Practice.Conditional_Loops;

import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the equal Side of the square (Only Once): ");
        double side = input.nextDouble();
        double perimeter = 4*side;
        System.out.println("Perimeter of the Square is: "+perimeter+" unit.");
    }
}
