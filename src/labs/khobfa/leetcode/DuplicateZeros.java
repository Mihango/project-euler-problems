package labs.khobfa.leetcode;

import java.util.Arrays;

public class DuplicateZeros {

    public static void main(String[] args) {
        int[] data = { 1,0,2,3,0,4,5,0};
        duplicateZeros(data);
        System.out.println("Shifted and Zero duplicated array === " + Arrays.toString(data));
    }
    public static void duplicateZeros(int[] arr) {
        int size = arr.length;

        for(int i=0; i< size; i++) {

            if(arr[i] == 0 && i != size -1) {
                int j = size - 1;

                while(j > i) {
                    arr[j] = arr[j - 1];
                    j--;
                }
                arr[i+1] = 0;
                i++;
            }
        }
    }
}
