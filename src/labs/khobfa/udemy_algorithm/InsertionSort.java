package labs.khobfa.udemy_algorithm;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] data = {20, 35, -15, 7, 55, 1, -22};
        System.out.println("Sorted array " + Arrays.toString(insertionSort(data)));
    }

    public static int[] insertionSort(int[] nums) {
        for (int i = 1; i< nums.length; i++) {
            if(nums[i] < nums[i-1]) {
                int value = nums[i];

                int j = i;
                while(j > 0 && value < nums[j-1]) {

                    nums[j] = nums[j-1];
                    j--;
                }

                nums[j] = value;
            }
        }

        return nums;
    }
}
