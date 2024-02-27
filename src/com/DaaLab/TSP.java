package com.DaaLab;

/*
Enter No. of Cities: 3
Enter the Cost Matrix:
23 45 65
12 98 65
54 65 98
The Optimal Tour is: 1->3->2->1
Minimum Cost: 142
Execution time: 19000 nanoseconds

 */
import java.util.Scanner;

public class TSP {
    static int tspDp(int[][] c, int[] tour, int start, int n) {
        int[] minTour = new int[10];
        int[] temp = new int[10];
        int mincost = 999;
        int ccost;
        int i;
        int j;
        int k;

        if (start == n - 1) {
            return (c[tour[n - 1]][tour[n]] + c[tour[n]][1]);
        }

        for (i = start + 1; i <= n; i++) {
            for (j = 1; j <= n; j++)
                temp[j] = tour[j];

            temp[start + 1] = tour[i];
            temp[i] = tour[start + 1];

            if ((c[tour[start]][tour[i]] + (ccost = tspDp(c, temp, start + 1, n))) < mincost) {
                mincost = c[tour[start]][tour[i]] + ccost;

                for (k = 1; k <= n; k++)
                    minTour[k] = temp[k];
            }
        }

        for (i = 1; i <= n; i++)
            tour[i] = minTour[i];

        return mincost;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] c = new int[10][10];
        int[] tour = new int[10];
        int i, j, cost;

        System.out.print("Enter No. of Cities: ");
        int n = in.nextInt();

        if (n == 1) {
            System.out.println("Path is not possible!");
            System.exit(0);
        }

        System.out.println("Enter the Cost Matrix:");
        for (i = 1; i <= n; i++)
            for (j = 1; j <= n; j++)
                c[i][j] = in.nextInt();

        for (i = 1; i <= n; i++)
            tour[i] = i;

        long startTime = System.nanoTime();
        cost = tspDp(c, tour, 1, n);
        long endTime = System.nanoTime();

        System.out.print("The Optimal Tour is: ");
        for (i = 1; i <= n; i++)
            System.out.print(tour[i] + "->");
        System.out.println("1");

        System.out.println("Minimum Cost: " + cost);
        long executionTime = endTime - startTime;
        System.out.println("Execution time: " + executionTime + " nanoseconds");

        in.close();
    }
}
