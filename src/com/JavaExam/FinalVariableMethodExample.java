package com.JavaExam;

public class FinalVariableMethodExample {

    void processValues(final int x, final int y) {
        // x and y are final variables within the method
        System.out.println("Sum: " + (x + y));
    }

    public static void main(String[] args) {
        FinalVariableMethodExample example = new FinalVariableMethodExample();
        example.processValues(10, 20);
    }
}

