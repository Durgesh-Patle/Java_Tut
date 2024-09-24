import java.util.*;
import java.io.*;

class ShortestPath {
    static final int V = 7;
    static int dist[] = new int[V];

    static void printSolution(int n) {
        System.out.println("Vertex Distance from Source");
        for (int i = 0; i < V; i++)
            System.out.println(i + " -> " + dist[i]);
    }

    int minDistance(boolean spt[]) {
        int min = Integer.MAX_VALUE, min_index = -1;

        for (int v = 0; v < V; v++) {
            if (spt[v] == false && dist[v] <= min) {
                min = dist[v];
                min_index = v;
            }
        }
        return min_index;
    }

    // shortest path algorithm for a graph represented using
    // adjacency matrix representation
    void dijkstra(int graph[][], int src) {

        // spt[i] will true if vertex i is included in
        // shortest path tree or shortest distance from src
        // to i is finalized
        boolean[] spt = new boolean[V];

        // Initialize all distances as INFINITE and stpSet[]
        // as false
        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
        }

        // Distance of source vertex from itself is always 0
        dist[src] = 0;

        // Find shortest path for all vertices.
        for (int i = 0; i < V - 1; i++) { // Because one Node is left.
            int u = minDistance(spt);

            // Mark the picked vertex as processed
            spt[u] = true;

            // Update dist value of the adjacent vertices of
            // the picked vertex.
            for (int v = 0; v < V; v++) {
                // Update dist[v] only if is not in sptSet,
                // there is an edge from u to v, and total
                // weight of path from src to v through u is
                // smaller than current value of dist[v]

                if (graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && spt[v] == false
                        && dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }
    }

    public static void main(String[] args) {

        int graph[][] = new int[][] { { 0, 2, 3, 0, 2, 0, 0 },
                { 2, 0, 0, 0, 0, 0, 3 },
                { 3, 0, 0, 1, 0, 8, 0 },
                { 0, 0, 1, 0, 1, 0, 0 },
                { 2, 0, 0, 1, 0, 1, 0 },
                { 0, 0, 8, 0, 1, 0, 7 },
                { 0, 3, 0, 0, 0, 7, 0 } };
        ShortestPath t = new ShortestPath();
        t.dijkstra(graph, 0);
        printSolution(V);
    }
}