package com.DaaLab;

import java.util.Scanner;

public class ZeroOneKnapsack {

    public static int knapsack(int[] weights, int[] values, int capacity) {
        int n = weights.length;
        int[][] dp = new int[n + 1][capacity + 1];

        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= capacity; w++) {
                if (i == 0 || w == 0)
                    dp[i][w] = 0;
                else if (weights[i - 1] <= w)
                    dp[i][w] = Math.max(values[i - 1] + dp[i - 1][w - weights[i - 1]], dp[i - 1][w]);
                else
                    dp[i][w] = dp[i - 1][w];
            }
        }

        return dp[n][capacity];
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of items: ");
        int n = input.nextInt();

        int[] weights = new int[n];
        int[] values = new int[n];

        System.out.println("Enter the weights of the items:");
        for (int i = 0; i < n; i++) {
            weights[i] = input.nextInt();
        }

        System.out.println("Enter the values of the items:");
        for (int i = 0; i < n; i++) {
            values[i] = input.nextInt();
        }

        System.out.print("Enter the capacity of the knapsack: ");
        int capacity = input.nextInt();

        long startTime = System.nanoTime();
        int maxVal = knapsack(weights, values, capacity);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        System.out.println("Maximum value that can be obtained: " + maxVal);
        System.out.println("Execution time: " + duration + " nanoseconds");

        input.close();
    }
}

