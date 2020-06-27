package labs.khobfa.leetcode;

import java.util.Arrays;

public class MergeSortedArrays {

    public static void main(String[] args) {
        int[] arr = new int[] {0, 1, 2, 3};
        int[] arr1 = new int[] { 5, 6, 7};
        System.out.println(Arrays.toString(merge(arr, arr.length, arr1, arr1.length)));

        int[] arr2 = new int[] {0, 1, 2, 3, 8};
        int[] arr3 = new int[] { 5, 6, 7};
        System.out.println(Arrays.toString(merge(arr3, arr3.length, arr2, arr2.length)));
    }

    public static int[] merge(int[] nums, int n, int[] nums2, int n2) {
        int[] result = new int[n2 + n];
        if(nums[n-1] < nums2[0]) {
            System.arraycopy(nums, 0, result, 0, n);
            System.arraycopy(nums2, 0, result, n, n2);
        } else {
            int[] temp = new int[n2 + n];
            int i = 0, j = 0;
            int tempIndex = 0;

            while (i < n && j < n2) {
                temp[tempIndex++] = nums[i] <= nums2[j] ? nums[i++] : nums2[j++];
            }
            System.arraycopy(temp, 0, result, 0, tempIndex);
            System.arraycopy(nums, i, result, tempIndex, n - i);
            System.arraycopy(nums2, j, result, tempIndex + (n-i), n2 - j);
        }

        return result;
    }
}
