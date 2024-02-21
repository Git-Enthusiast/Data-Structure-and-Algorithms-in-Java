package com.JavaExam.StaticMembers;

public class MethodAccessExamples {

    // Non-static field
    int nonStaticField = 42;

    // Static method
    static void staticMethod() {
        // Compilation error: Cannot make a static reference to the non-static field
        // int value = nonStaticField;

        // To access non-static members, you need to create an instance
        MethodAccessExamples instance = new MethodAccessExamples();
        int value = instance.nonStaticField;
    }

    public static void main(String[] args) {
        // Calling the static method
        staticMethod();
    }


    public void nonStaticMethod() {

    }
}

