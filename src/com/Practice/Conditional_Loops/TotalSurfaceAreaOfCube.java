package com.Practice.Conditional_Loops;

import java.util.Scanner;

public class TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
        // Total Surface Area Of Cube = 6a2
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the equal Side of the Cube (Only Once): ");
        double side = input.nextDouble();
        double TSA = 6*side;
        System.out.println("Total Surface Area Of Cube is: "+TSA+" Sq unit.");
    }
}
