package com.Practice.Conditional_Loops;

import java.util.Scanner;
public class VolumeOfPyramid {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the type of pyramid to calculate volume:");
        System.out.println("1. Triangular Pyramid");
        System.out.println("2. Square Pyramid");
        System.out.println("3. Rectangular Pyramid");
        System.out.println("4. Hexagonal Pyramid");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                calculateTriangularPyramidVolume();
                break;
            case 2:
                calculateSquarePyramidVolume();
                break;
            case 3:
                calculateRectangularPyramidVolume();
                break;
            case 4:
                calculateHexagonalPyramidVolume();
                break;
            default:
                System.out.println("Invalid choice. Please choose a valid option.");
        }

        scanner.close();
    }

    private static void calculateTriangularPyramidVolume() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the base length (a):");
        double baseLength = scanner.nextDouble();

        System.out.println("Enter the height of the triangular face:");
        double triangleHeight = scanner.nextDouble();

        System.out.println("Enter the height of the pyramid:");
        double height = scanner.nextDouble();

        // Calculate the base area of the triangular pyramid
        double baseArea = 0.5 * baseLength * triangleHeight;

        // Calculate the volume of the triangular pyramid
        double volume = (1.0 / 6.0) * baseArea * height;

        System.out.println("The volume of the Triangular Pyramid is: " + volume + " cubic units");
    }

    private static void calculateSquarePyramidVolume() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the base length (a):");
        double baseLength = scanner.nextDouble();

        System.out.println("Enter the height of the pyramid:");
        double height = scanner.nextDouble();

        // Calculate the volume of the square pyramid
        double volume = (1.0 / 3.0) * baseLength * baseLength * height;

        System.out.println("The volume of the Square Pyramid is: " + volume + " cubic units");
    }

    private static void calculateRectangularPyramidVolume() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length (l):");
        double length = scanner.nextDouble();

        System.out.println("Enter the width (b):");
        double width = scanner.nextDouble();

        System.out.println("Enter the height of the pyramid:");
        double height = scanner.nextDouble();

        // Calculate the volume of the rectangular pyramid
        double volume = (1.0 / 3.0) * length * width * height;

        System.out.println("The volume of the Rectangular Pyramid is: " + volume + " cubic units");
    }

    private static void calculateHexagonalPyramidVolume() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the base length (a):");
        double baseLength = scanner.nextDouble();

        System.out.println("Enter the height of the pyramid:");
        double height = scanner.nextDouble();

        // Calculate the volume of the hexagonal pyramid
        double volume = (1.0 / 3.0) * (3.0 * Math.sqrt(3.0) / 2.0) * baseLength * baseLength * height;

        System.out.println("The volume of the Hexagonal Pyramid is: " + volume + " cubic units");
    }
}


