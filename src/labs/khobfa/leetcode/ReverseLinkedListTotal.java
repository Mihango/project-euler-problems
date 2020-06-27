package labs.khobfa.leetcode;

/**
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */
public class ReverseLinkedListTotal {

    public static void main(String[] args) {
        LinkedNode node = createNode(243);
        LinkedNode node2 = createNode(564);

        LinkedNode node3 = node;
        LinkedNode node4 = node2;

        while (node != null) {
            System.out.print(node.val);
            node = node.next;
        }

        System.out.println();

        while (node2 != null) {
            System.out.print(node2.val);
            node2 = node2.next;
        }

        System.out.println();
        System.out.println(creteNumberFromNode(node3));
        System.out.println(creteNumberFromNode(node4));

        LinkedNode node5 = addTwoNumbers(node3, node4);
        while (node5 != null) {
            System.out.print(node5.val);
            node5 = node5.next;
        }
    }

    public static LinkedNode createNode(int num) {
        if(num > 0) {
            LinkedNode node = new LinkedNode(num % 10);
            num /= 10;

            while(num >= 1) {
                LinkedNode next = new LinkedNode(num % 10);
                num /= 10;
                LinkedNode current = node;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = next;
            }
            return node;
        }
        return new LinkedNode();
    }

    public static int creteNumberFromNode(LinkedNode node) {
        int result = 0;
        int count = 0;
        while (node != null) {
            result += (Math.pow(10, count) * node.val);
            count++;
            node = node.next;
        }
        return result;
    }

    public static LinkedNode addTwoNumbers(LinkedNode l1, LinkedNode l2) {
        int num1 = creteNumberFromNode(l1);
        int num2 = creteNumberFromNode(l2);
        return createNode(num1 + num2);
    }
}

class LinkedNode {
    int val;
    LinkedNode next;

    public LinkedNode() {}
    public LinkedNode(int val) {
        this.val = val;
    }
    public LinkedNode(int val, LinkedNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return val + " >>> ";
    }
}
