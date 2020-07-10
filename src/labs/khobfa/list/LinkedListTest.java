package labs.khobfa.list;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(3);
//        linkedList.insert(1);
//        linkedList.insert(4);
//        linkedList.insert(5);
//        linkedList.insert(2);

        System.out.println("Linked List size >>>> " + linkedList.size());
        for (Integer integer : linkedList) {
            System.out.print(integer + " ");
        }
        System.out.println("\nReversed linked list");
        linkedList = ReverseLinkedList.reverse(linkedList.peek());
        for (Integer v: linkedList) {
            System.out.print(v + " ");
        }

        System.out.println("\nOriginal linked list");
        linkedList = ReverseLinkedList.recursive(linkedList.peek());
        for (Integer v: linkedList) {
            System.out.print(v + " ");
        }
    }
}
