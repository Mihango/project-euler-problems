package labs.khobfa.udemy_algorithm;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class InsertionSort {
    public static void main(String[] args) {
        int[] data = {20, 35, -15, 7, 55, 1, -22};
        String s = "0101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101";
        System.out.println("Sorted array " + binaryToDecimal(s));

        HashMap<Integer, Integer> map = new HashMap<>();

        int num = 0;
        Iterator it = map.entrySet().iterator();
        while(it.hasNext()) {
            int v =(int) ((Map.Entry)it.next()).getValue();
        };
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

    static int binaryToDecimal(String n)
    {
        String number = n;
        int decimal = 0;

        // Initializing base value to 1,
        // i.e 2^0
        int base = 1;

        int len = number.length();
        for (int i = len - 1; i >= 0; i--) {
            if (number.charAt(i) == '1')
                decimal += base;
            base = base * 2;
        }

        return decimal;
    }
}
