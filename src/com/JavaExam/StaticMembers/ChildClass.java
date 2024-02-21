package com.JavaExam.StaticMembers;

public class ChildClass extends ParentClass {
    public static void main(String[] args) {
        // Accessing the static variable from the parent class
        System.out.println("Value of sharedVar in ChildClass: " + sharedVar);
    }
}
