package labs.khobfa.leetcode;

import kotlin.collections.unsigned.UArraysKt;

import java.util.Arrays;

public class SortedSquare {

    public static void main(String[] args) {
        int[] data = {-4, -1, 0, 3, 10};
        divideMerge(data);
        //System.out.println("Sorted squares >>> " + Arrays.toString(squareAndSort(data)));
        System.out.println("Sorted squares >>> " + Arrays.toString(data));
    }

    public static int[] squareAndSort(int[] nums) {
        int[] squares = new int[nums.length];

        int count = 0;
        for (int num : nums) {
            int square = num * num;

            int j = count;
            while (j > 0 && square < squares[j - 1]) {
                squares[j] = squares[j - 1];
                j--;
            }
            squares[j] = square;
            count++;
        }

        return squares;
    }

    // geeks for geeks solution - works with sorted array
    public static void divideMerge(int[] nums) {
        int n = nums.length;
        // divide array into parts negative and positive
        int k;
        for(k = 0; k < n; k++) {
            if(nums[k] >= 0) {
                break;
            }
        }
        // merge two sorted array
        int i = k-1;
        int j = k;
        int ind = 0; // initial index of tem array

        int[] temp = new int[n];
        while (i >= 0 && j < n) {
            if(nums[i] * nums[i] < nums[j] * nums[j]) {
                temp[ind] = nums[i] * nums[i];
                i--;
            } else {
                temp[ind] = nums[j] * nums[j];
                j++;
            }
            ind++;
        }

        while (i > 0) {
            temp[ind++] = nums[i] * nums[i];
            i--;
        }

        while (j < n) {
            temp[ind++] = nums[j] * nums[j];
            j++;
        }

        // copy temp array into original
        for (int x =0; x < n; x++) {
            nums[x] = temp[x];
        }
    }
}
