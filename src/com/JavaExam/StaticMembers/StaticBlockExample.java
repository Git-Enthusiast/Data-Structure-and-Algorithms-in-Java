package com.JavaExam.StaticMembers;

public class StaticBlockExample {
    // Static variable
    static int staticVar;

    // Static block for initialization
    static {
        staticVar = 20;
    }

    public static void main(String[] args) {
        // Accessing a static variable initialized in a static block
        System.out.println("Static variable after static block: " + staticVar);
    }
}

