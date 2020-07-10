package labs.khobfa.leetcode.microsoft;

import labs.khobfa.core.ListNode;

public class LinkedListPalindrome {

    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int value) {
            this.val = value;
        }

        public ListNode(int value, ListNode next) {
            this.val = value;
            this.next = next;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    private static boolean isPalindrome(ListNode head) {
        ListNode prehead = new ListNode(-1, head);
        ListNode reverse = reverse(head);
        head = prehead.next;

        while (reverse != null && head != null) {
            if (reverse.val == head.val) {
                reverse = reverse.next;
                head = head.next;
            }
            else
                return false;
        }
        return reverse == null && head == null;
    }

    private static ListNode reverse(ListNode node) {
        ListNode prev = null;
        ListNode current = node;
        ListNode next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    public static void main(String[] main) {
        ListNode l2 = new ListNode(0);
        ListNode l1 = new ListNode(0, l2);
        System.out.println(isPalindrome(l1));
    }
}
