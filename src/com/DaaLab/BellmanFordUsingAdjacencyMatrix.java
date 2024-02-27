package com.DaaLab;

/*
Enter the number of vertices
6
Enter the adjacency matrix
0 4 0 0 -1 0
0 0 -1 0 -2 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 -5 0 3
0 0 0 0 0 0
Enter the source vertex
1
distance of source  1 to 1 is 0
distance of source  1 to 2 is 4
distance of source  1 to 3 is 3
distance of source  1 to 4 is -6
distance of source  1 to 5 is -1
distance of source  1 to 6 is 2
Execution time: 26934700 nanoseconds

 */
import java.util.Scanner;

public class BellmanFordUsingAdjacencyMatrix {
    private final int[] distances;
    private final int numberOfVertices;
    public static final int MAX_VALUE = 999;

    public BellmanFordUsingAdjacencyMatrix(int numberOfVertices) {
        this.numberOfVertices = numberOfVertices;
        distances = new int[numberOfVertices + 1];
    }

    public void BellmanFordEvaluation(int source, int[][] adjacencyMatrix) {
        for (int node = 1; node <= numberOfVertices; node++) {
            distances[node] = MAX_VALUE;
        }

        distances[source] = 0;
        for (int node = 1; node <= numberOfVertices - 1; node++) {
            for (int sourcenode = 1; sourcenode <= numberOfVertices; sourcenode++) {
                for (int destinationnode = 1; destinationnode <= numberOfVertices; destinationnode++) {
                    if (adjacencyMatrix[sourcenode][destinationnode] != MAX_VALUE) {
                        if (distances[destinationnode] > distances[sourcenode]
                                + adjacencyMatrix[sourcenode][destinationnode])
                            distances[destinationnode] = distances[sourcenode]
                                    + adjacencyMatrix[sourcenode][destinationnode];
                    }
                }
            }
        }

        for (int sourcenode = 1; sourcenode <= numberOfVertices; sourcenode++) {
            for (int destinationnode = 1; destinationnode <= numberOfVertices; destinationnode++) {
                if (adjacencyMatrix[sourcenode][destinationnode] != MAX_VALUE) {
                    if (distances[destinationnode] > distances[sourcenode]
                            + adjacencyMatrix[sourcenode][destinationnode])
                        System.out.println("The Graph contains negative edge cycle");
                }
            }
        }

        for (int vertex = 1; vertex <= numberOfVertices; vertex++) {
            System.out.println("distance of source  " + source + " to " + vertex + " is " + distances[vertex]);
        }
    }

    public static void main(String... arg) {
        int numberofvertices = 0;
        int source;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of vertices");
        numberofvertices = scanner.nextInt();

        int adjacencymatrix[][] = new int[numberofvertices + 1][numberofvertices + 1];
        System.out.println("Enter the adjacency matrix");
        for (int sourcenode = 1; sourcenode <= numberofvertices; sourcenode++) {
            for (int destinationnode = 1; destinationnode <= numberofvertices; destinationnode++) {
                adjacencymatrix[sourcenode][destinationnode] = scanner.nextInt();
                if (sourcenode == destinationnode) {
                    adjacencymatrix[sourcenode][destinationnode] = 0;
                    continue;
                }
                if (adjacencymatrix[sourcenode][destinationnode] == 0) {
                    adjacencymatrix[sourcenode][destinationnode] = MAX_VALUE;
                }
            }
        }

        System.out.println("Enter the source vertex");
        source = scanner.nextInt();

        long startTime = System.nanoTime();
        BellmanFordUsingAdjacencyMatrix bellmanford = new BellmanFordUsingAdjacencyMatrix(numberofvertices);
        bellmanford.BellmanFordEvaluation(source, adjacencymatrix);
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;
        System.out.println("Execution time: " + executionTime + " nanoseconds");
        scanner.close();
    }
}
