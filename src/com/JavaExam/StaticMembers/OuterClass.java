package com.JavaExam.StaticMembers;

public class OuterClass {

    private static String outerStaticField = "I am a static field in OuterClass";

    static class StaticNestedClass {
        void printOuterStaticField() {
            // Accessing static field from the outer class
            System.out.println(outerStaticField);
        }
    }

    public static void main(String[] args) {
        // Creating an instance of the static nested class
        StaticNestedClass nestedInstance = new StaticNestedClass();
        nestedInstance.printOuterStaticField();
    }
}

