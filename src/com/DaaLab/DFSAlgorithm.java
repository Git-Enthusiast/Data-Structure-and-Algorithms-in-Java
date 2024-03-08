package com.DaaLab;

/*
Enter the number of vertices: 5
Enter the number of edges: 6
Enter the edges (from to):
0 1
0 2
1 3
2 3
2 4
3 4
Enter the source vertex for DFS: 2
DFS traversal starting from vertex 2:
2 3 4
Execution time: 18963500 nanoseconds


 */
import java.util.*;

public class DFSAlgorithm {
    private final int V; // Number of vertices

    private final LinkedList[] adj; // Adjacency list representation of graph

    // Constructor
    DFSAlgorithm(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    // Function to add an edge into the graph
    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    // DFS traversal
    void DFSUtil(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");

        for (Object o : adj[v]) {
            int n = (int) o;
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }

    // DFS traversal starting from a given source vertex
    void DFS(int v) {
        boolean[] visited = new boolean[V];
        DFSUtil(v, visited);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of vertices: ");
        int vertices = scanner.nextInt();
        DFSAlgorithm g = new DFSAlgorithm(vertices);

        System.out.print("Enter the number of edges: ");
        int edges = scanner.nextInt();

        System.out.println("Enter the edges (from to):");
        for (int i = 0; i < edges; i++) {
            int from = scanner.nextInt();
            int to = scanner.nextInt();
            g.addEdge(from, to);
        }

        System.out.print("Enter the source vertex for DFS: ");
        int sourceVertex = scanner.nextInt();

        scanner.close();

        // Recording the start time
        long startTime = System.nanoTime();

        // Running DFS from the given source vertex
        System.out.println("DFS traversal starting from vertex " + sourceVertex + ":");
        g.DFS(sourceVertex);

        // Recording the end time
        long endTime = System.nanoTime();

        // Calculating execution time
        long duration = (endTime - startTime);
        System.out.println("\nExecution time: " + duration + " nanoseconds");
    }
}
