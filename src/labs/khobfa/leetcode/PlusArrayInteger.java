package labs.khobfa.leetcode;

import javax.imageio.stream.FileCacheImageOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlusArrayInteger {
    public static List<Integer> addToArrayForm(int[] A, int K) {
        int m = A.length;
        int carry = K;
        List<Integer> result = new ArrayList<>();
        int i = m -1;
        while (i >= 0 || carry > 0) {
            if(i >= 0) {
                carry += A[i];
            }
            result.add(carry % 10);
            carry /= 10;
            i--;
        }
        Collections.reverse(result);
        return result;
    }

    public static void main(String[] args) {
        for (int a : addToArrayForm(new int[]{1, 2, 0, 0}, 32)) {
            System.out.print(a);
        }
    }
}
