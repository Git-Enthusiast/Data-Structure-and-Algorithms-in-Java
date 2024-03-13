package com.JavaExam;

class PyramidPrinter implements Runnable {
    private final int numRows;

    public PyramidPrinter(int numRows) {
        this.numRows = numRows;
    }

    @Override
    public void run() {
        synchronized (System.out) {
            for (int i = 1; i <= numRows; i++) {
                for (int j = 1; j <= numRows - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}

public class MultiThreading {
    public static void main(String[] args) {
        int numRows = 5; // Adjust the number of rows as needed
        Thread t1 = new Thread(new PyramidPrinter(numRows));
        t1.start();
    }
}