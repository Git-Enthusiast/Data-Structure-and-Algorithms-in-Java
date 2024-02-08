package com.Practice.Conditional_Loops;

import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        // volume = (1/3) · π · r2 · h
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Both the Radius and Height of the Cone respectively: ");
        double radius = input.nextDouble();
        double height = input.nextDouble();
        double Volume = ((double) 1 /3)*Math.PI*Math.pow(radius,2)*height;
        System.out.println("Volume of the Cone is: "+Volume+" unit.");
    }
}
