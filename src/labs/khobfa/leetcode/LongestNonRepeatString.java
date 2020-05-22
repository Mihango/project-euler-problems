package labs.khobfa.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestNonRepeatString {

    public static void main(String[] args) {
        String s = "dvdf";
        String s2 = "pwwkew";
//        System.out.println(lengthOfLongestSubstring2(s2));
        System.out.println(lengthOfLongestSubstring(s2));
    }

    // sliding window
    public static int lengthOfLongestSubstring2(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;

        while (i < n && j < n) {
            char ch = s.charAt(j);
            if (!set.contains(ch)) {
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }


    // optimizing above method
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;

        for (int j = 0, i = 0; j < s.length(); j++) {
            char ch = s.charAt(j);
            if (map.containsKey(ch)) {
                i = Math.max(map.get(ch), i);
            }
            count = Math.max(count, j - i + 1);
            map.put(ch, j+1);
        }

        return count;
    }

    public static int bruteForce(String s) {
        int n = s.length();
        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (allUnique(s, i, j))
                    ans = Math.max(ans, j - 1);
            }
        }
        return ans;
    }

    public static boolean allUnique(String s, int start, int end) {
        Set<Character> set = new HashSet<>();
        for (int i = start; i < end; i++) {
            if (set.contains(s.charAt(i)))
                return false;
            set.add(s.charAt(i));
        }
        return true;
    }
}
