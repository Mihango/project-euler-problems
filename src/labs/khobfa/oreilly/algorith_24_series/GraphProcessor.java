package labs.khobfa.oreilly.algorith_24_series;

public class GraphProcessor {
    public static int degree(UndirectedGraph graph, int source) {
        int degree = 0;
        for(int node : graph.adj(source))
            degree++;

        return degree;
    }

    public static int maxDegree(UndirectedGraph graph) {
        int max = 0;
        for (int v =0; v < graph.getVertices(); v++)
            if(degree(graph, v) > max)
                max = degree(graph, v);
        return max;
    }

    public static double averageDegree(UndirectedGraph graph) {
        return 2.0 * graph.getEdges() / graph.getVertices();
    }

    public static int numberOfSelfLoops(UndirectedGraph graph) {
        int count =0;
        for(int v =0; v < graph.getVertices(); v++)
            for(int node : graph.adj(v))
                if(v == node)
                    count++;

        return count / 2;
    }
}
