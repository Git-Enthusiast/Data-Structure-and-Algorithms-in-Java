package com.DaaLab;

/*
Enter the number of vertices
4
Enter the Weighted Matrix for the graph
0 0 3 0
2 0 0 0
0 7 0 1
6 0 0 0
The Transitive Closure of the Graph
	1	2	3	4
1	0	10	3	4
2	2	0	5	6
3	7	7	0	1
4	6	16	9	0

 */
import java.util.Scanner;

public class FloydWarshall {
    private final int[][] distanceMatrix;
    private final int numberOfVertices;
    public static final int INFINITY = 999;

    public FloydWarshall(int numberOfVertices) {
        distanceMatrix = new int[numberOfVertices + 1][numberOfVertices + 1];
        this.numberOfVertices = numberOfVertices;
    }

    public void floydWarshall(int[][] adjacencyMatrix) {
        for (int source = 1; source <= numberOfVertices; source++) {
            for (int destination = 1; destination <= numberOfVertices; destination++) {
                distanceMatrix[source][destination] = adjacencyMatrix[source][destination];
            }
        }

        for (int intermediate = 1; intermediate <= numberOfVertices; intermediate++) {
            for (int source = 1; source <= numberOfVertices; source++) {
                for (int destination = 1; destination <= numberOfVertices; destination++) {
                    if (distanceMatrix[source][intermediate] + distanceMatrix[intermediate][destination]
                            < distanceMatrix[source][destination])
                        distanceMatrix[source][destination] = distanceMatrix[source][intermediate]
                                + distanceMatrix[intermediate][destination];
                }
            }
        }

        for (int source = 1; source <= numberOfVertices; source++)
            System.out.print("\t" + source);

        System.out.println();
        for (int source = 1; source <= numberOfVertices; source++) {
            System.out.print(source + "\t");
            for (int destination = 1; destination <= numberOfVertices; destination++) {
                System.out.print(distanceMatrix[source][destination] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String... arg) {
        int[][] adjacency_matrix;
        int numberOfVertices;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of vertices");
        numberOfVertices = scan.nextInt();

        adjacency_matrix = new int[numberOfVertices + 1][numberOfVertices + 1];
        System.out.println("Enter the Weighted Matrix for the graph");
        for (int source = 1; source <= numberOfVertices; source++) {
            for (int destination = 1; destination <= numberOfVertices; destination++) {
                adjacency_matrix[source][destination] = scan.nextInt();
                if (source == destination) {
                    adjacency_matrix[source][destination] = 0;
                    continue;
                }
                if (adjacency_matrix[source][destination] == 0) {
                    adjacency_matrix[source][destination] = INFINITY;
                }
            }
        }

        long startTime = System.nanoTime();
        System.out.println("The Transitive Closure of the Graph");
        FloydWarshall floydwarshall = new FloydWarshall(numberOfVertices);
        floydwarshall.floydWarshall(adjacency_matrix);
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;
        System.out.println("Execution time: " + executionTime + " nanoseconds");
        scan.close();
    }
}
