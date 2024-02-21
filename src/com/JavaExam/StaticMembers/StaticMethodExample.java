package com.JavaExam.StaticMembers;

public class StaticMethodExample {
    // Static variable
    static int staticVar = 5;

    // Static method accessing a static variable
    static void printStaticVar() {
        System.out.println("Static variable in static method: " + staticVar);
    }

    public static void main(String[] args) {
        printStaticVar(); // Calling a static method
    }
}
