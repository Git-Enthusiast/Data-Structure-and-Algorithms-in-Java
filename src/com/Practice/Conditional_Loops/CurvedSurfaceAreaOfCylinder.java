package com.Practice.Conditional_Loops;

import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        // Curved Surface Area Of Cylinder = 2πr × h
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Both the Radius and Height of the Cylinder respectively: ");
        double radius = input.nextDouble();
        double height = input.nextDouble();
        double curvedSurfaceAreaOfCylinder = 2*Math.PI*radius*height;
        System.out.println("Volume of the Cone is: "+curvedSurfaceAreaOfCylinder+" unit.");
    }
}
