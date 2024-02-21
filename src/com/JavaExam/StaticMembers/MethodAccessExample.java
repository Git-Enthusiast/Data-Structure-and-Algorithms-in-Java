package com.JavaExam.StaticMembers;

public class MethodAccessExample {

    // Static method
    static void staticMethod() {
        System.out.println("This is a static method");
    }

    // Non-static method
    void nonStaticMethod() {
        System.out.println("This is a non-static method");

        // Accessing the static method directly using the class name
        MethodAccessExamples.staticMethod();

        // Alternatively, you can access the static method through an instance
        staticMethod();
    }

    public static void main(String[] args) {
        MethodAccessExamples instance = new MethodAccessExamples();

        // Calling the non-static method
        instance.nonStaticMethod();
    }
}
