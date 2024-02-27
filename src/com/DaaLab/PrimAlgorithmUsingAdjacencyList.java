package com.DaaLab;

/*
Enter the number of vertices: 5
Enter the number of edges: 10
Enter edges in the format 'source destination weight':
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
Execution Time: 123000 nanoseconds
The sum of all the edge weights: 39

 */
import java.util.*;

class Pair {
    int node;
    int distance;
    public Pair(int distance, int node) {
        this.node = node;
        this.distance = distance;
    }
}

class Solution {
    static int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj) {
        PriorityQueue<Pair> pq =
                new PriorityQueue<Pair>((x, y) -> x.distance - y.distance);

        int[] vis = new int[V];
        pq.add(new Pair(0, 0));
        int sum = 0;
        long startTime = System.nanoTime();
        while (!pq.isEmpty()) {
            int wt = pq.peek().distance;
            int node = pq.peek().node;
            pq.remove();

            if (vis[node] == 1) continue;
            vis[node] = 1;
            sum += wt;

            for (int i = 0; i < adj.get(node).size(); i++) {
                int edW = adj.get(node).get(i).get(1);
                int adjNode = adj.get(node).get(i).get(0);
                if (vis[adjNode] == 0) {
                    pq.add(new Pair(edW, adjNode));
                }
            }
        }
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;
        System.out.println("Execution Time: " + executionTime + " nanoseconds");
        return sum;
    }
}

public class PrimAlgorithmUsingAdjacencyList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of vertices: ");
        int V = scanner.nextInt();
        ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<ArrayList<Integer>>());
        }

        System.out.print("Enter the number of edges: ");
        int E = scanner.nextInt();
        System.out.println("Enter edges in the format 'source destination weight':");
        for (int i = 0; i < E; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int w = scanner.nextInt();

            ArrayList<Integer> tmp1 = new ArrayList<>();
            ArrayList<Integer> tmp2 = new ArrayList<>();
            tmp1.add(v);
            tmp1.add(w);

            tmp2.add(u);
            tmp2.add(w);

            adj.get(u).add(tmp1);
            adj.get(v).add(tmp2);
        }

        Solution obj = new Solution();
        int sum = Solution.spanningTree(V, adj);
        System.out.println("The sum of all the edge weights: " + sum);

        scanner.close();
    }
}

