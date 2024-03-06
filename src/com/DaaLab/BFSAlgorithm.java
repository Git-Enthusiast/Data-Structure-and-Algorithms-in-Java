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
Enter the source vertex for BFS: 0
BFS traversal starting from vertex 0:
0 1 2 3 4
Execution time: 13567800 nanoseconds

 */
import java.util.*;

public class BFSAlgorithm {
    private int V; // Number of vertices

    private LinkedList<Integer> adj[]; // Adjacency list representation of graph

    // Constructor
    BFSAlgorithm(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    // Function to add an edge into the graph
    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    // Prints BFS traversal from a given source s
    void BFS(int s) {
        boolean visited[] = new boolean[V];

        LinkedList<Integer> queue = new LinkedList<>();

        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0) {
            s = queue.poll();
            System.out.print(s + " ");

            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of vertices: ");
        int vertices = scanner.nextInt();
        BFSAlgorithm g = new BFSAlgorithm(vertices);

        System.out.print("Enter the number of edges: ");
        int edges = scanner.nextInt();

        System.out.println("Enter the edges (from to):");
        for (int i = 0; i < edges; i++) {
            int from = scanner.nextInt();
            int to = scanner.nextInt();
            g.addEdge(from, to);
        }

        System.out.print("Enter the source vertex for BFS: ");
        int sourceVertex = scanner.nextInt();

        scanner.close();

        // Recording the start time
        long startTime = System.nanoTime();

        // Running BFS from the given source vertex
        System.out.println("BFS traversal starting from vertex " + sourceVertex + ":");
        g.BFS(sourceVertex);

        // Recording the end time
        long endTime = System.nanoTime();

        // Calculating execution time
        long duration = (endTime - startTime);
        System.out.println("\nExecution time: " + duration + " nanoseconds");
    }
}

