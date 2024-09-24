import java.util.*;

// Undestination And unWeighted Graph.

public class InnerGraph {
    // can we declare Edge.
    static class Edge {
        int src; // Source.
        int dest; // Distination.

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }

    }

    public static void createGraph( ArrayList<Edge> graph[]){ // Create A graph.
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>(); // Create a Empty ArrayList .jisme ham Directly data(Edge) ko add kra skte he.
        }

        // Graph ke ander edges ko add krna.
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(0, 1));
        graph[3].add(new Edge(0, 2));
    }
    public static void main(String[] args) {
        int v=4; // Vertex.

        ArrayList<Edge> graph[]=new ArrayList[v];  

        createGraph(graph);

        // Print 1's neibours.
        for(int i=0;i<graph[1].size();i++){  
            Edge e=graph[1].get(i);   // Because This is ArrayList.
            System.out.print(e.dest+" ");
        }

    }

}