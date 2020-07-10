package labs.khobfa.geekforgeeks;

import java.util.Arrays;

public class SubArraySum {
    private static int[] subArrayKSum(int[] A, int k) {
        if (A == null) return null;
        if (A.length == 0) return A;

        int start = 0;
        int sum = A[0];
        int end = 0;

        for (int i = 1; i < A.length; i++) {
            sum += A[i];
            end = i;
            if (sum > k) {
                while (sum > k) {
                    sum -= A[start++];
                    if (sum == k) {
                        return createSubArray(A, start, end);
                    }
                }
            } else if(sum == k)
                return createSubArray(A, start, end);
        }
        return null;
    }

    private static int[] createSubArray(int[] A, int start, int end) {
        int[] subArray = new int[end-start+1];
        System.arraycopy(A, start, subArray, 0, end - start+1);
        return subArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(subArrayKSum(new int[] {1, 4, 20, 3, 10, 5}, 33)));
    }
}
