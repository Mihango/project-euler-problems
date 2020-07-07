package labs.khobfa.leetcode;

public class MergeSortedLinkedList {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if(l1 == null) {
            return l2;
        }
        if(l2 == null) {
            return l1;
        }

        ListNode result;
        ListNode c = null;
        ListNode a = l1;
        ListNode b = l2;

        if(a.val <= b.val) {
            result = a;
            a = a.next;
        }
        else {
            result = b;
            b = b.next;
        }


        while(a != null || b != null) {

            if(a != null && b != null) {
                if(a.val <= b.val) {
                    result.next = a;
                    a = a.next;
                } else {
                    result.next = b;
                    b = b.next;
                }
            } else {
                if(a != null) {
                    result.next = a;
                    a = a.next;
                }

                if(b != null) {
                    result.next = b;
                    b = b.next;
                }
            }

            if(c == null) {
                c = result;
            }
            result = result.next;
        }
        return c;
    }

    public static void main(String[] args) {
        ListNode l3 = new ListNode(4);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);


        ListNode l6 = new ListNode(3);
        ListNode l5 = new ListNode(2, l6);
        ListNode l4 = new ListNode(1, l5);

        ListNode node = mergeTwoLists(l1, l4);

        while (node != null) {
            System.out.print(node.val+ " ");
            node = node.next;
        }
    }
}
