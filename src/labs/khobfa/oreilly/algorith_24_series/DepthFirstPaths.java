package labs.khobfa.oreilly.algorith_24_series;

import java.util.List;
import java.util.Stack;

public class DepthFirstPaths extends Paths {

    private final boolean[] marked;
    private final Integer[] edgeTo; // holds node from which accessed specific node

    public DepthFirstPaths(UndirectedGraph graph, int source) {
        super(graph, source);
        marked = new boolean[graph.getVertices()];
        edgeTo = new Integer[graph.getVertices()];
        depthFirstSearch(graph, source);
    }

    @Override
    public boolean hasPathTo(int node) {
        return marked[node];
    }

    @Override
    public Iterable<Integer> pathTo(int node) {
        if(!hasPathTo(node)) return null;

        Stack<Integer> stack = new Stack<>();
        stack.push(node);

        while (edgeTo[node] != null) {
            node = edgeTo[node];
            stack.push(node);
        }
        return stack;
    }


    private void depthFirstSearch(UndirectedGraph graph, int node) {
        marked[node] = true;
        for(int w : graph.adj(node)) {
            if(!marked[w]) {
                depthFirstSearch(graph, w);
                edgeTo[w] = node;
            }
        }
    }

    /**
     * @param node
     * @return
     *
     * implemented recursively using an arraylist > LIFO - better option user stack
     */
//    @Deprecated
//    @Override
//    public Iterable<Integer> pathTo(int node) {
//        List<Integer> path = new ArrayList<>();
//
////        path.add(node);
////        while (true) {
////            Integer edgeFrom = edgeTo[node];
////            if (edgeFrom == null) {
////                break;
////            }
////            path.add(edgeFrom);
////            node = edgeFrom;
////        }
////
//        pathTo(path,edgeTo[node]);
//
//        if(path.size() > 0) {
//            path.add(node);
//            return path;
//        } else {
//            return null;
//        }
//    }

    private void pathTo(List<Integer> list, int node) {
        if (edgeTo[node] != null) {
            pathTo(list, edgeTo[node]);
        }
        list.add(node);
    }
}
