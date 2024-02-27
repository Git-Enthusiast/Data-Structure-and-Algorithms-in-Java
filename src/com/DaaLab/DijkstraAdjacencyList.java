package com.DaaLab;

import java.util.*;
/*
Enter the number of vertices: 5
Enter the number of edges: 10
Enter edges with weights (source destination weight):
0 1 10
1 2 5
2 3 20
3 4 30
4 0 25
0 2 8
0 3 18
1 4 15
1 3 11
2 4 22
Enter source vertex: 0
Vertex 	 Distance from Source
0 	 0
1 	 10
2 	 8
3 	 18
4 	 25
Execution Time: 67700 nanoseconds

 */
public class DijkstraAdjacencyList {

    static final int INF = Integer.MAX_VALUE;

    static class Edge {
        int dest;
        int weight;

        public Edge(int dest, int weight) {
            this.dest = dest;
            this.weight = weight;
        }
    }

    static class Graph {
        int V;
        List<List<Edge>> adj;

        public Graph(int V) {
            this.V = V;
            adj = new ArrayList<>(V);
            for (int i = 0; i < V; i++) {
                adj.add(new ArrayList<>());
            }
        }

        public void addEdge(int src, int dest, int weight) {
            adj.get(src).add(new Edge(dest, weight));
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
                for (Edge e : adj.get(u)) {
                    int v = e.dest;
                    if (!visited[v] && dist[u] != INF &&
                            dist[u] + e.weight < dist[v]) {
                        dist[v] = dist[u] + e.weight;
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
        System.out.print("Enter the number of edges: ");
        int E = scanner.nextInt();
        System.out.println("Enter edges with weights (source destination weight):");
        for (int i = 0; i < E; i++) {
            int src = scanner.nextInt();
            int dest = scanner.nextInt();
            int weight = scanner.nextInt();
            graph.addEdge(src, dest, weight);
        }
        System.out.print("Enter source vertex: ");
        int source = scanner.nextInt();
        graph.dijkstra(source);
        scanner.close();
    }
}
