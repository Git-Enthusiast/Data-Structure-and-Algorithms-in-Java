package com.JavaExam.StaticMembers;

public class SharedStaticVariableExample {
    // Static variable shared among instances
    static int sharedVar = 0;

    public SharedStaticVariableExample() {
        sharedVar++;  // Modifying the sharedVar in each instance constructor
    }

    public static void main(String[] args) {
        SharedStaticVariableExample obj1 = new SharedStaticVariableExample();
        // Accessing sharedVar from instances
        System.out.println("Value of sharedVar in obj1: " + obj1.sharedVar);
        SharedStaticVariableExample obj2 = new SharedStaticVariableExample();
        // Accessing sharedVar from instances
        System.out.println("Value of sharedVar in obj2: " + obj2.sharedVar);
    }
}

