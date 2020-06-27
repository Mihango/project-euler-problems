package labs.khobfa.list;

public class ReverseLinkedList {

    public static LinkedList reverse(LinkedList linkedList) {
        if (linkedList.size() < 2) return linkedList;

        LinkedList.Node previous = null;
        LinkedList.Node current = linkedList.peek();
        LinkedList.Node next;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        linkedList.setRoot(previous);
        return linkedList;
    }
}
