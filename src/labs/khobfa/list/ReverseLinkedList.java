package labs.khobfa.list;

public class ReverseLinkedList {


    public static LinkedList reverse(LinkedList.Node node) {

        LinkedList.Node previous = null;
        LinkedList.Node current = node;
        LinkedList.Node next;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        LinkedList linkedList = new LinkedList();
        linkedList.setRoot(previous);
        return linkedList;
    }

    public static LinkedList recursive(LinkedList.Node node) {
        LinkedList list = new LinkedList();
        list.setRoot(recursiveReverse(node));
        return list;
    }

    public static LinkedList.Node recursiveReverse(LinkedList.Node head) {
        LinkedList.Node first;

        if (head==null || head.next == null)
            return head;

        first = recursiveReverse(head.next);
        head.next.next = head;
        head.next = null;

        return first;
    }
}
