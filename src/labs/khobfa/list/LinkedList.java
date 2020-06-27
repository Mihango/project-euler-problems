package labs.khobfa.list;

import java.util.Iterator;

public class LinkedList implements Iterable<Integer> {
    private int N;
    private Node first;

    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public void insert(int value) {
        if (first == null)
            first = new Node(value);
        else insert(value, first);
        N++;
    }

    private void insert(int value, Node node) {
        if(node.next == null)
            node.next = new Node(value);
        else insert(value, node.next);
    }

    public int size() {
        return N;
    }

    public Node peek() {
        return first;
    }

    public void setRoot(Node node) {
        first = node;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new LinkedIterator();
    }

    private class LinkedIterator implements Iterator<Integer> {
        private Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Integer next() {
            int value = current.value;
            current = current.next;
            return value;
        }
    }
}
