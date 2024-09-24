import java.util.*;

// // Undestination And Weighted Graph.
// public class Weightedg {

//     // can we declare Edge.
//     static class Edge {
//         int src; // Source.
//         int dest; // Distination.
//         int wt; // Weight.

//         public Edge(int s, int d, int w) {
//             this.src = s;
//             this.dest = d;
//             this.wt = w;
//         }

//     }

//     public static void createGraph(ArrayList<Edge> graph[]) { // Create A graph.
//         for (int i = 0; i < graph.length; i++) {
//             graph[i] = new ArrayList<Edge>(); // Create a Empty ArrayList .jisme ham Directly data(Edge) ko add kra skte
//                                               // he.
//         }

//         // Graph ke ander edges ko add krna.
//         graph[0].add(new Edge(0, 2,2));

//         graph[1].add(new Edge(1, 2,10));
//         graph[1].add(new Edge(1, 3,0));

//         graph[2].add(new Edge(2, 0,2));
//         graph[2].add(new Edge(2, 1,10));
//         graph[2].add(new Edge(2, 3,-1));

//         graph[3].add(new Edge(0, 1,-1));
//         graph[3].add(new Edge(0, 2,0));
//     }

//     public static void main(String[] args) {
//         int v = 4; // Vertex.

//         ArrayList<Edge> graph[] = new ArrayList[v];

//         createGraph(graph);

//         // Print 1's neibours.
//         for (int i = 0; i < graph[2].size(); i++) {
//             Edge e = graph[2].get(i); // Because This is ArrayList.
//             System.out.println(e.dest + " , "+ e.wt);
//         }

//     }

// }

// Implementation.

import java.util.ArrayList;

/**
 * Weightedg
 */
public class Weightedg {

    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 2, 10));

        graph[1].add(new Edge(1, 2, 2));
        graph[1].add(new Edge(1, 3, 0));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 1, 4));
        graph[2].add(new Edge(2,3, 9));

        graph[3].add(new Edge(3, 5, -3));
        graph[3].add(new Edge(3, 3, 5));
    }

    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge> graph[] = new ArrayList[4];


        createGraph(graph);


        for(int i=0;i<graph[2].size();i++){
            Edge e=graph[2].get(i);
            System.out.println(e.dest+" , "+e.wt);
        }

    }
}
