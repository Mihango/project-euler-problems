package labs.khobfa.oreilly.algorith_24_series;

public class GraphTest {

    public static void main(String[] args)  {
        UndirectedGraph undirectedGraph = new UndirectedGraph(7);

        undirectedGraph.addEdge(0, 1);
        undirectedGraph.addEdge(0, 2);
        undirectedGraph.addEdge(0, 6);
        undirectedGraph.addEdge(0, 5);
        undirectedGraph.addEdge(6, 4);
        undirectedGraph.addEdge(4, 3);
        undirectedGraph.addEdge(4, 5);
        undirectedGraph.addEdge(5, 3);


        DepthFirstPaths paths = new DepthFirstPaths(undirectedGraph, 0);

        paths.pathTo(4)
        .forEach(node -> System.out.print(" --> " + node));
    }
}
