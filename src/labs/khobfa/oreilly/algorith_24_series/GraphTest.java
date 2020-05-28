package labs.khobfa.oreilly.algorith_24_series;

import java.util.List;
import java.util.Stack;

public class GraphTest {

    public static void main(String[] args)  {
        UndirectedGraph undirectedGraph = new UndirectedGraph(9);

        undirectedGraph.addEdge(0, 1);
        undirectedGraph.addEdge(0, 2);
        undirectedGraph.addEdge(0, 6);
        undirectedGraph.addEdge(0, 5);
        undirectedGraph.addEdge(6, 4);
        undirectedGraph.addEdge(4, 3);
        undirectedGraph.addEdge(4, 5);
        undirectedGraph.addEdge(5, 3);
        undirectedGraph.addEdge(7, 8);


        System.out.println("\n================== DFS ==================");
        DepthFirstPaths paths = new DepthFirstPaths(undirectedGraph, 0);

        // note ---> iterable from stack can be casted to List
        List<Integer> stack = (List<Integer>) paths.pathTo(3);
        int count = stack.size() - 1;
        while (count >= 0) {
            System.out.print(" --> " + stack.remove(count));
            count--;
        }

        System.out.println("\n================== BFS ==================");

        BreadthFirstPaths bfsPath = new BreadthFirstPaths(undirectedGraph, 7);
        Stack<Integer> stack1 = (Stack<Integer>) bfsPath.pathTo(8);
        while (!stack1.empty()) {
            System.out.print(" --> " + stack1.pop());
        }

        System.out.println("\n================== ConnectedComponent ==================");
        ConnectedComponent cc = new ConnectedComponent(undirectedGraph);
        System.out.println(cc.getCount());
    }
}
