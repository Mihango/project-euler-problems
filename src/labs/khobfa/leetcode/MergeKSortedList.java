package labs.khobfa.leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/merge-k-sorted-lists/
 * https://leetcode.com/problems/sort-list/
 * https://leetcode.com/problems/shortest-word-distance-ii/
 */

public class MergeKSortedList {
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

    public static ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) return null;

        ListNode preHead = new ListNode(Integer.MIN_VALUE);
        ListNode prev = preHead;
        int length = lists.length;
        int lastNull = length;

        while(lastNull > 1) {
            int min = Integer.MAX_VALUE;
            for(int i = 0; i < length; i++) {
                if(lists[i] != null) {
                    if(min == Integer.MAX_VALUE || lists[min].val > lists[i].val) {
                        min = i;
                    }
                }
            }

            if(min != Integer.MAX_VALUE) {
                prev.next = lists[min];
                lists[min] = lists[min].next;
                if(lists[min] == null) {
                    --lastNull;
                }
                prev = prev.next;

            } else {
                --lastNull;
            }
        }
        for (ListNode list : lists) {
            if (list != null) {
                prev.next = list;
                break;
            }
        }

        return preHead.next;
    }

    public static void main(String[] args) {
        ListNode l3 = new ListNode(3);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);

        ListNode l6 = new ListNode(4);
        ListNode l5 = new ListNode(2, l6);
        ListNode l4 = new ListNode(1, l5);

        ListNode l7 = new ListNode(-1);

        ListNode node = mergeKLists(new ListNode[]{l7, l1, l4});
        while (node != null) {
            System.out.print(node.val+ " ");
            node = node.next;
        }
    }
}
