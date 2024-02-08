package com.Practice.Conditional_Loops;

import java.util.Scanner;

public class VolumeOfPrism {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the type of prism to calculate volume:");
        System.out.println("1. Triangular Prism");
        System.out.println("2. Rectangular Prism");
        System.out.println("3. Pentagonal Prism");
        System.out.println("4. Hexagonal Prism");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                calculateTriangularPrismVolume();
                break;
            case 2:
                calculateRectangularPrismVolume();
                break;
            case 3:
                calculatePentagonalPrismVolume();
                break;
            case 4:
                calculateHexagonalPrismVolume();
                break;
            default:
                System.out.println("Invalid choice. Please choose a valid option.");
        }

        scanner.close();
    }

    private static void calculateTriangularPrismVolume() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the base length (a):");
        double baseLength = scanner.nextDouble();

        System.out.println("Enter the height (h):");
        double height = scanner.nextDouble();

        System.out.println("Enter the base width (b):");
        double baseWidth = scanner.nextDouble();

        double volume = 0.5 * baseWidth * baseLength * height;
        System.out.println("The volume of the Triangular Prism is: " + volume + " cubic units");
    }

    private static void calculateRectangularPrismVolume() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length (l):");
        double length = scanner.nextDouble();

        System.out.println("Enter the width (b):");
        double width = scanner.nextDouble();

        System.out.println("Enter the height (h):");
        double height = scanner.nextDouble();

        double volume = length * width * height;
        System.out.println("The volume of the Rectangular Prism is: " + volume + " cubic units");
    }

    private static void calculatePentagonalPrismVolume() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the base length (a):");
        double baseLength = scanner.nextDouble();

        System.out.println("Enter the height (h):");
        double height = scanner.nextDouble();

        double volume = (5.0 / 2.0) * baseLength * height;
        System.out.println("The volume of the Pentagonal Prism is: " + volume + " cubic units");
    }

    private static void calculateHexagonalPrismVolume() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the base length (a):");
        double baseLength = scanner.nextDouble();

        System.out.println("Enter the height (h):");
        double height = scanner.nextDouble();

        double volume = 3.0 * baseLength * height;
        System.out.println("The volume of the Hexagonal Prism is: " + volume + " cubic units");
    }
}
