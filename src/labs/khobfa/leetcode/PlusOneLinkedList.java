package labs.khobfa.leetcode;

public class PlusOneLinkedList {

    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int value) {
            val = value;
        }
    }

    public static ListNode plusOne(ListNode node) {
        ListNode root = new ListNode(0);
        root.next = node;
        ListNode notNine = root;

        while (node != null) {
            if (node.val != 9) notNine = node;
            node = node.next;
        }

        notNine.val++;
        notNine = notNine.next;

        while (notNine != null) {
            notNine.val = 0;
            notNine = notNine.next;
        }

        return root.val != 0 ? root : root.next;
    }



    public static void main(String[] args) {
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(9);
        node1.next = node2;
        node2.next = node3;

        ListNode node = plusOne(node1);
        while (node != null) {
            System.out.print(node.val);
            node = node.next;
        }
    }
}
