package com.JavaExam;

abstract class Shape {
    // Abstract method
    abstract void draw();

    // Concrete method
    void displayArea() {
        System.out.println("This method displays the area.");
    }
}

class Circle extends Shape {
    // Implementing the abstract method
    void draw() {
        System.out.println("Drawing a Circle");
    }

    // This class inherits the non-abstract method displayArea()
}

class Rectangle extends Shape {
    // Implementing the abstract method
    void draw() {
        System.out.println("Drawing a Rectangle");
    }

    // Overriding the displayArea() method
    void displayArea() {
        System.out.println("This method displays the area of a rectangle.");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();
        circle.displayArea();

        Rectangle rectangle = new Rectangle();
        rectangle.draw();
        rectangle.displayArea();
    }
}
