package labs.khobfa.oreilly.algorith_24_series;

public class UndirectedGraph {

    //  adjacency list using Bag data type
    private final Bag<Integer>[] adj;

    @SuppressWarnings({"unchecked", "rawtypes"})
    public UndirectedGraph(int vertices) {
        // create empty graph with V vertices
        adj =  (Bag<Integer>[]) new Bag[vertices];

        for (int v = 0; v < vertices; v++) {
            adj[v] = new Bag();
        }
    }

    // add edge v - w (parallel edges are allowed since it is undirected graph)
    public void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
    }

    // iterator for vertices adjacent to v
    public Iterable<Integer> adj(int v) {
        return adj[v];
    }

    public Bag<Integer>[] getAdj() {
        return adj;
    }
}
