package com.DaaLab;

/*
Enter the number of vertices: 7
Enter the number of edges: 8
Enter the edges (vertex1 vertex2):
0 1
0 2
1 2
1 3
2 4
3 5
4 5
5 6
Vertex Cover:
0 1 2 3 4 5
Execution Time: 13 milliseconds

 */
import java.util.*;

class VertexCoverOptimization {

    static class Graph {
        int vertices;
        List<Integer>[] adjacencyList;

        Graph(int vertices) {
            this.vertices = vertices;
            adjacencyList = new LinkedList[vertices];
            for (int i = 0; i < vertices; ++i)
                adjacencyList[i] = new LinkedList<>();
        }

        void addEdge(int v, int w) {
            adjacencyList[v].add(w);
            adjacencyList[w].add(v);
        }

        void printVertexCover() {
            boolean[] visited = new boolean[vertices];

            for (int u = 0; u < vertices; u++) {
                if (!visited[u]) {
                    for (Integer v : adjacencyList[u]) {
                        if (!visited[v]) {
                            visited[u] = true;
                            visited[v] = true;
                            break;
                        }
                    }
                }
            }

            System.out.println("Vertex Cover:");
            for (int i = 0; i < vertices; i++) {
                if (visited[i])
                    System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of vertices: ");
        int vertices = scanner.nextInt();
        Graph graph = new Graph(vertices);

        System.out.print("Enter the number of edges: ");
        int edges = scanner.nextInt();

        System.out.println("Enter the edges (vertex1 vertex2):");
        for (int i = 0; i < edges; i++) {
            int v = scanner.nextInt();
            int w = scanner.nextInt();
            graph.addEdge(v, w);
        }

        long startTime = System.currentTimeMillis(); // Record start time

        graph.printVertexCover();

        long endTime = System.currentTimeMillis(); // Record end time

        printExecutionTime(startTime, endTime);

        scanner.close();
    }

    // Utility function to print execution time
    public static void printExecutionTime(long startTime, long endTime) {
        System.out.println("\nExecution Time: " + (endTime - startTime) + " milliseconds");
    }
}
