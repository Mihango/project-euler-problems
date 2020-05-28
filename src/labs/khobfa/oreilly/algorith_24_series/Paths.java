package labs.khobfa.oreilly.algorith_24_series;

import java.util.ArrayList;

public abstract class Paths {
    private UndirectedGraph graph;
    private int sourceNode;

    // find paths in graph from source s
    public Paths(UndirectedGraph graph, int source)  {
        this.graph = graph;
        this.sourceNode = source;
    }

    // is there path from sourceNode to node
    public abstract boolean hasPathTo(int node);

    // path from sourceNode to  node, null if no such path
    public abstract Iterable<Integer> pathTo(int node);
}
