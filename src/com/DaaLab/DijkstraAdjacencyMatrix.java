package com.DaaLab;

import java.util.*;
/*
Enter the number of vertices: 5
Enter the adjacency matrix (5x5):
0 2 0 6 0
2 0 3 8 5
0 3 0 0 7
6 8 0 0 9
0 5 7 9 0
Enter source vertex: 0
Vertex 	 Distance from Source
0 	 0
1 	 2
2 	 5
3 	 6
4 	 7
Execution Time: 38800 nanoseconds

 */
public class DijkstraAdjacencyMatrix {

    static final int INF = Integer.MAX_VALUE;

    static class Graph {
        int V;
        int[][] graph;

        public Graph(int V) {
            this.V = V;
            graph = new int[V][V];
        }

        public void setEdge(int i, int j, int weight) {
            graph[i][j] = weight;
            graph[j][i] = weight; // Assuming undirected graph
        }

        public void dijkstra(int src) {
            boolean[] visited = new boolean[V];
            int[] dist = new int[V];
            Arrays.fill(dist, INF);
            dist[src] = 0;

            long startTime = System.nanoTime();

            for (int count = 0; count < V - 1; count++) {
                int u = minDistance(dist, visited);
                visited[u] = true;
                for (int v = 0; v < V; v++) {
                    if (!visited[v] && graph[u][v] != 0 && dist[u] != INF &&
                            dist[u] + graph[u][v] < dist[v]) {
                        dist[v] = dist[u] + graph[u][v];
                    }
                }
            }

            long endTime = System.nanoTime();
            long executionTime = endTime - startTime;

            printSolution(dist, executionTime);
        }

        private int minDistance(int[] dist, boolean[] visited) {
            int min = INF, minIndex = -1;
            for (int v = 0; v < V; v++) {
                if (!visited[v] && dist[v] <= min) {
                    min = dist[v];
                    minIndex = v;
                }
            }
            return minIndex;
        }

        private void printSolution(int[] dist, long executionTime) {
            System.out.println("Vertex \t Distance from Source");
            for (int i = 0; i < V; i++) {
                System.out.println(i + " \t " + dist[i]);
            }
            System.out.println("Execution Time: " + executionTime + " nanoseconds");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of vertices: ");
        int V = scanner.nextInt();
        Graph graph = new Graph(V);
        System.out.println("Enter the adjacency matrix (" + V + "x" + V + "):");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                graph.graph[i][j] = scanner.nextInt();
            }
        }
        System.out.print("Enter source vertex: ");
        int source = scanner.nextInt();
        graph.dijkstra(source);
        scanner.close();
    }
}

