package com.Practice.Conditional_Loops;

import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        // volume =  π · r2 · h
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Both the Radius and Height of the Cylinder respectively: ");
        double radius = input.nextDouble();
        double height = input.nextDouble();
        double Volume = Math.PI*Math.pow(radius,2)*height;
        System.out.println("Volume of the Cylinder is: "+Volume+" Cubic unit.");
    }
}
