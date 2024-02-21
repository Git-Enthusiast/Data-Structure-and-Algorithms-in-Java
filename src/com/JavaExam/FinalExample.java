package com.JavaExam;

final public class FinalExample {
    /*
    The combination ensures that the class cannot be extended,
    the method cannot be overridden, and the variable cannot be reassigned.
     */
    final int MAX_VALUE = 100;

    final void printMessage() {
        System.out.println("This is a final method.");
    }

    public static void main(String[] args) {
        FinalExample example = new FinalExample();
        System.out.println("Maximum value: " + example.MAX_VALUE);
        example.printMessage();
    }
}
