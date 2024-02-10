package com.Practice.Conditional_Loops;

import java.util.Scanner;

public class CalcDistanceBetweenTwoPoints {
    public static void main(String[] args) {
        // Distance, d=√((x2 – x1)² + (y2 – y1)²)
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Coordinates of the Two Points. ");
        System.out.println("Please Enter Your X-Coordinate of the Points-1: ");
        float x1 = input.nextFloat();
        System.out.println("Please Enter Your Y-Coordinate of the Points-1: ");
        float y1 = input.nextFloat();
        System.out.println("Please Enter Your X-Coordinate of the Points-2: ");
        float x2 = input.nextFloat();
        System.out.println("Please Enter Your Y-Coordinate of the Points-2: ");
        float y2 = input.nextFloat();
        double distance = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        System.out.println("The Distance between two Point: "+distance);
    }
}
