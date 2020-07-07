package labs.khobfa.core;

public class ListNode {
    int val;
    ListNode next;

    public ListNode(int value) {
        this.val = value;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }

    public static ListNode doWork(ListNode node) {
        // change value
        ListNode n = node;
        n.val = 23;
        System.out.println("in do work >>>> " + node);
        System.out.println("n in do work >>>> " + node);
        return node;
    }

    public static void main(String[] args) {
        ListNode preHead = new ListNode(-1);
        ListNode prev = preHead;
        prev.next = new ListNode(34);
        System.out.println(preHead);
        System.out.println("prev before doWork >>> " +  prev);
        doWork(prev);
        System.out.println("prev after doWork >>> " +  prev);
        System.out.println("preHead after doWork >>> " +  preHead);

    }
}
