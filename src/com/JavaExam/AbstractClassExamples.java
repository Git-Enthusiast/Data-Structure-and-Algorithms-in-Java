package com.JavaExam;

abstract class Shapes {
    abstract void draw();
}

class Circles extends Shape {
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

public class AbstractClassExamples {
    public static void main(String[] args) {
        // Attempting to create an instance of the abstract class will result in a compilation error
        // Shape shape = new Shape(); // Compilation error: 'Shape' is abstract; cannot be instantiated

        // Creating instances of concrete subclasses is allowed
        Circles circles = new Circles();
        circles.draw();
    }
}

