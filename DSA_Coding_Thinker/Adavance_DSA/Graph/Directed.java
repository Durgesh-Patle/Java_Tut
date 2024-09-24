import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// find the graph(Directed) is Cycle Detection.
// find the graph(UnDirected) is Cycle Detection.

public class Directed {

    private final int V;
    private final List<List<Integer>> adj;

    public Directed(int V) {
        this.V = V;
        adj = new ArrayList<>(V);

        for (int i = 0; i < V; i++)
            adj.add(new LinkedList<>());
    }

    public void addEdge(int source, int dest) {
        adj.get(source).add(dest);
    }

    public boolean isCyclic() {
       boolean[] vis =new boolean[V];
       boolean[] resStack =new boolean[V];

       for(int i=0;i<V;i++){
        if(dfs(i,vis,resStack)) return true;
       }
       return false;
    }

    public boolean dfs(int i,boolean[] vis,boolean[] resStack){
        if(resStack[i]) return true;

        if(vis[i]) return false;

        vis[i]=true;
        resStack[i]=true;
        List<Integer> list= adj.get(i);
        for(Integer x:list){ // Integer Class he. 
            if(dfs(x, vis, resStack)) return false;
        }
        resStack[i]=false; // Backtraking. 
        return false;
    }

    // Driver code
    public static void main(String[] args) {
        int V = 6;
        Directed graph = new Directed(V);

        graph.addEdge(0, 1);

        graph.addEdge(0, 5);

        graph.addEdge(1, 3);

        graph.addEdge(2, 3);

        graph.addEdge(3, 4);

        graph.addEdge(4, 5);

        graph.addEdge(2, 5);
        // graph.addEdge(5, 2);

        if (graph.isCyclic())
            System.out.println("Graph contains cycle");
        else
            System.out.println("Graph doesn't contain cycle");

    }
}
