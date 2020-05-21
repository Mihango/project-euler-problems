package labs.khobfa.leetcode.microsoft;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {
        char[] data = {'h', 'e', 'l', 'l', 'o'};
        reverseString(data);
        System.out.println("Reversed >>>> " + Arrays.toString(data));
        System.out.println("Reversed >>>> " + reverseSubString("HELLO", 2));
        System.out.println("Reversed >>>> " + reverseSubString2("abcdefg", 2));
    }

    public static void reverseString(char[] data) {
        int i = 0, j = data.length -1;

        while (i < j) {
            char temp = data[i];
            data[i++] = data[j];
            data[j--] = temp;
        }
    }

    public static String reverseSubString(String s, int constant) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i += constant) {
            int j = Math.min(i + constant, s.length() - 1);

           // String subString = s.substring(i, i+constant);

            while (j >= i) {
                builder.append(s.charAt(j));
                j--;
            }
            i += constant;
        }

        return builder.toString();
    }

    public static String reverseSubString2(String s, int constant) {
        char[] data = s.toCharArray();

        for (int start = 0; start<data.length; start += 2 * constant) {

            int i = start, j = Math.min(start + constant - 1, data.length - 1);

            while (i < j) {
                char temp = data[i];
                data[i++] = data[j];
                data[j--] = temp;
            }
        }
        return Arrays.toString(data);
    }
}
