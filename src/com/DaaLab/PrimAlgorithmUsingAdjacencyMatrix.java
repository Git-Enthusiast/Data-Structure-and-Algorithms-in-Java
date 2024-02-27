package com.DaaLab;

/*
Enter the number of vertices: 5
Please Enter 'n*n' matrix the same is given below for vertices = 5 (for sample):
0 2 0 6 0
2 0 3 8 5
0 3 0 0 7
6 8 0 0 9
0 5 7 9 0

Enter the adjacency matrix:
0 2 0 6 0
2 0 3 8 5
0 3 0 0 7
6 8 0 0 9
0 5 7 9 0
Edge 	Weight
0 - 1	2
1 - 2	3
0 - 3	6
1 - 4	5
Total weight of MST: 16
Execution time for Adjacency Matrix Representation: 26 milliseconds

 */
import java.util.Arrays;
import java.util.Scanner;

public class PrimAlgorithmUsingAdjacencyMatrix {

    private static final int INF = Integer.MAX_VALUE;

    public int primMST(int graph[][]) {
        int V = graph.length;
        int[] parent = new int[V];
        int[] key = new int[V];
        boolean[] mstSet = new boolean[V];

        Arrays.fill(key, INF);
        Arrays.fill(mstSet, false);

        key[0] = 0;
        parent[0] = -1;
        int totalWeight = 0;

        for (int count = 0; count < V - 1; count++) {
            int u = minKey(key, mstSet);
            mstSet[u] = true;

            for (int v = 0; v < V; v++)
                if (graph[u][v] != 0 && !mstSet[v] && graph[u][v] < key[v]) {
                    parent[v] = u;
                    key[v] = graph[u][v];
                }
        }

        for (int i = 1; i < V; i++) {
            totalWeight += graph[i][parent[i]];
        }

        printMST(parent, graph);
        return totalWeight;
    }

    private int minKey(int[] key, boolean[] mstSet) {
        int min = Integer.MAX_VALUE, minIndex = -1;

        for (int v = 0; v < key.length; v++)
            if (!mstSet[v] && key[v] < min) {
                min = key[v];
                minIndex = v;
            }

        return minIndex;
    }

    private void printMST(int[] parent, int[][] graph) {
        System.out.println("Edge \tWeight");
        for (int i = 1; i < graph.length; i++)
            System.out.println(parent[i] + " - " + i + "\t" + graph[i][parent[i]]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of vertices: ");
        int V = scanner.nextInt();
        System.out.println("Please Enter 'n*n' matrix the same is given below for vertices = 5 (for sample):" +
                "\n" +
                "0 2 0 6 0\n" +
                "2 0 3 8 5\n" +
                "0 3 0 0 7\n" +
                "6 8 0 0 9\n" +
                "0 5 7 9 0\n");
        int[][] graph = new int[V][V];
        System.out.println("Enter the adjacency matrix:");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                graph[i][j] = scanner.nextInt();
            }
        }

        PrimAlgorithmUsingAdjacencyMatrix prim = new PrimAlgorithmUsingAdjacencyMatrix();

        long startTime = System.currentTimeMillis();
        int totalWeight = prim.primMST(graph);
        long endTime = System.currentTimeMillis();
        System.out.println("Total weight of MST: " + totalWeight);
        System.out.println("Execution time for Adjacency Matrix Representation: " + (endTime - startTime) + " milliseconds");

        scanner.close();
    }
}


