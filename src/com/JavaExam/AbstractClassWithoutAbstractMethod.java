package com.JavaExam;

abstract class Shape1 {
    private String color;

    // Constructor
    public Shape1(String color) {
        this.color = color;
    }

    // Concrete method
    public void displayColor() {
        System.out.println("Color: " + color);
    }

    // Another concrete method
    public double calculatePerimeter() {
        return 0.0; // Default implementation for demonstration purposes
    }
}

class Circle1 extends Shape1 {
    private double radius;

    // Constructor
    public Circle1(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    // Override the calculatePerimeter method
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

public class AbstractClassWithoutAbstractMethod {
    public static void main(String[] args) {
        Circle1 circle = new Circle1("Red", 5.0);
        circle.displayColor();
        System.out.println("Perimeter of the circle: " + circle.calculatePerimeter());
    }
}

