package com.JavaLab;

/*
Shape is an abstract class with abstract methods area(), perimeter(), and display().
TwoDimensionalShape is an abstract class extending Shape, with an abstract method draw().
Circle is a concrete class extending TwoDimensionalShape and implementing all the abstract methods.
area() and perimeter() are abstract methods in the Shape class, meaning every subclass must provide their implementation.
name is an abstract variable declared in the Shape class, which will be implemented in subclasses.
The main method demonstrates the usage by creating an instance of the Circle class and invoking its methods.


Name: Circle
Area: 78.53981633974483
Perimeter: 31.41592653589793
Drawing Circle...

 */
abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double area();

    public abstract double perimeter();

    public abstract void display();
}

abstract class TwoDimensionalShape extends Shape {
    public TwoDimensionalShape(String name) {
        super(name);
    }

    public abstract void draw();
}

class Circle extends TwoDimensionalShape {
    private final double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle...");
    }
}

public class UsingAbstract {
    public static void main(String[] args) {
        Circle circle = new Circle("Circle", 5.0);
        circle.display();
        circle.draw();
    }
}
