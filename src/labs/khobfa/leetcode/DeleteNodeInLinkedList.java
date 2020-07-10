package labs.khobfa.leetcode;

//  delete a node only given that node
public class DeleteNodeInLinkedList {
    static class Node {
       int val;
        Node next;
       public Node(int val) {
           this.val = val;
       }
       public Node(int val, Node next) {
           this.val = val;
           this.next = next;
       }
    }

    public static void deleteNode(Node node) {
        node = deleteNode2(node);
    }

    public static Node deleteNode2(Node node) {
        if (node == null || node.next == null)
             return null;
        node.val = node.next.val;
        node.next = deleteNode2(node.next);
        return node;
    }

    public static void main(String[] args) {
        Node node = new Node(9);
        Node node1 = new Node(1, node);
        Node node2 = new Node(5, node1);
        Node node3 = new Node(4, node2);

        deleteNode(node2);

        Node n = node3;
        while (n != null) {
            System.out.print(n.val + " ");
            n = n.next;
        }
    }
}
