package com.Practice.Conditional_Loops;

import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        // volume = (4/3) · π · r3
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the Radius of the Sphere : ");
        double radius = input.nextDouble();
        double Volume = ((double) 4 /3)*Math.PI*Math.pow(radius,3);
        System.out.println("Volume of the Cylinder is: "+Volume+" Cubic unit.");
    }
}
