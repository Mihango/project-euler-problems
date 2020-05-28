package labs.khobfa.oreilly.algorith_24_series;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

public class BreadthFirstPaths extends Paths {

    private final boolean[] marked;
    private final Integer[] edgeTo;
    private final int[] distanceToNode;

    public BreadthFirstPaths(UndirectedGraph graph, int source) {
        super(graph, source);
        int size = graph.getAdj().length;
        marked = new boolean[size];
        edgeTo = new Integer[size];
        distanceToNode = new int[size];

        breathFirstSearch(graph, source);
    }

    private void breathFirstSearch(UndirectedGraph graph, int source) {
        Queue<Integer> queue = new LinkedBlockingQueue<>();
        queue.add(source);

        // mark node is visited
        marked[source] = true;

        while (!queue.isEmpty()) {
            int node = queue.remove();

            for (int n : graph.adj(node)) {
                if (!marked[n]) {
                    System.out.println(node + " ------->>>>>>> " + n);
                    queue.add(n);
                    marked[n] = true;
                    edgeTo[n] = node;
                    distanceToNode[n] = distanceToNode[n] + 1;
                }
            }
        }
    }

    @Override
    public boolean hasPathTo(int node) {
        return marked[node];
    }

    @Override
    public Iterable<Integer> pathTo(int node) {
        if (!hasPathTo(node)) return null;

        Stack<Integer> stack = new Stack<>();
        stack.push(node);

        for (int i = 0; i < distanceToNode[node]; i++) {
            Integer n = edgeTo[node];
            stack.push(n);
        }

        return stack;
    }
}
