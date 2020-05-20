package labs.khobfa.leetcode.microsoft;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {
        char[] data = {'h', 'e', 'l', 'l', 'o'};
        reverseString(data);
        System.out.println("Reversed >>>> " + Arrays.toString(data));
    }

    public static void reverseString(char[] data) {
        int i = 0, j = data.length -1;

        while (i < j) {
            char temp = data[i];
            data[i++] = data[j];
            data[j--] = temp;
        }
    }
}
