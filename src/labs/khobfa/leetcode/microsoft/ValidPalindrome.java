package labs.khobfa.leetcode.microsoft;

import labs.khobfa.ListNode;

public class ValidPalindrome {
    public static void main(String[] args) {
//        String input = "A man, a plan, a canal: Panama";
        String input = "abb"; // "race a car";
        boolean result = validPalindrome(input);
        System.out.println("Is palindrome >>> " + result);


        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("......a....."));
        System.out.println(isPalindrome("."));
    }

    public static boolean validPalindrome(String palindrome) {
        boolean isPalindrome = true;
        palindrome = palindrome
                .replaceAll("[^A-Za-z0-9]", "")
                .toLowerCase();

        char[] data = palindrome.toCharArray();
        int i = 0;
        int n = data.length;
        int mid = n / 2;

        if (n % 2 != 0 && n > 3) {
            mid -= 1;
        }

        while (i < mid) {
            if (data[i] != data[n - i - 1]) {
                isPalindrome = false;
                break;
            }
            i++;
        }

        return isPalindrome;
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                ++i;
                continue;
            }

            if (!Character.isLetterOrDigit(s.charAt(j))) {
                --j;
                continue;
            }

            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }

        return true;
    }

    public static boolean isPalindrome(ListNode head) {
        ListNode reverse = reverse(head);
        return false;
    }

    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode node = current.getNext();
            current.setNext(prev);
            prev = current;
            current = node;
        }
        return current;
    }
}
