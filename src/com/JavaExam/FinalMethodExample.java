package com.JavaExam;

public class FinalMethodExample {
    final void printMessage() {
        System.out.println("This is a final method.");
    }
}

class Subclass extends FinalMethodExample {
    // Compilation error: Cannot override the final method from FinalMethodExample
    // void printMessage() {
    //     System.out.println("Overriding the final method.");
    // }
}

