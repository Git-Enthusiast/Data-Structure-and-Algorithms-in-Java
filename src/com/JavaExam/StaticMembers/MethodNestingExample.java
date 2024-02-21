package com.JavaExam.StaticMembers;

public class MethodNestingExample {

    void outerMethod() {
        System.out.println("This is the outer method.");

        // Calling the nested method
        nestedMethod();
    }

    void nestedMethod() {
        System.out.println("This is the nested method.");
    }

    public static void main(String[] args) {
        MethodNestingExample example = new MethodNestingExample();
        example.outerMethod();
    }
}

