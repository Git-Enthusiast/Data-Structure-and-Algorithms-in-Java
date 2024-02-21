package com.JavaExam.StaticMembers;

public class StaticMethodWithoutInstance {
    // Static method
    static void staticMethod() {
        System.out.println("This is a static method");
    }

    public static void main(String[] args) {
        // Calling a static method without creating an instance
        StaticMethodWithoutInstance.staticMethod();
    }
}

