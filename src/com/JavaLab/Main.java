package com.JavaLab;

class PrintPyramid implements Runnable {
    private final int row;
    private final int totalRows;

    public PrintPyramid(int row, int totalRows) {
        this.row = row;
        this.totalRows = totalRows;
    }

    @Override
    public void run() {
        synchronized (System.out) {
            for (int i = 0; i < totalRows - row; i++)
                System.out.print(" ");

            for (int i = 0; i < 2 * row - 1; i++)
                System.out.print("*");

            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int totalRows = 5; // Change this to adjust the number of rows in the pyramid
        Thread[] threads = new Thread[totalRows];

        for (int i = 1; i <= totalRows; i++) {
            threads[i - 1] = new Thread(new PrintPyramid(i, totalRows));
            threads[i - 1].start();
            try {
                threads[i - 1].join(); // Ensures each thread finishes before the next one starts
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt(); // Restore interrupted status
            }
        }
    }
}

