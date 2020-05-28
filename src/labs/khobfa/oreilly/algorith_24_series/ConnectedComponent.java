package labs.khobfa.oreilly.algorith_24_series;

public class ConnectedComponent {

    private int[] ids;
    private boolean[] marked;
    private int count = 0;

    public ConnectedComponent(UndirectedGraph graph) {
        marked = new boolean[graph.getAdj().length];
        ids = new int[graph.getAdj().length];
        for (int v = 0; v < graph.getAdj().length; v++) {
            if(!marked[v]) {
                depthFirstSearch(graph, v);
                count++;
            }
        }
    }

    public int id(int v) {
        return ids[v];
    }

    public int getCount() {
        return count;
    }

    private void depthFirstSearch(UndirectedGraph graph, int v) {
        marked[v] = true;
        ids[v] = count;
        for (int w : graph.adj(v)) {
            if(!marked[w])
                depthFirstSearch(graph, w);
        }
    }
}
