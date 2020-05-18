package labs.khobfa.leetcode;

public class EvenNumberDigits {
    public static void main(String[] args) {
        int[] data = { 1, 12, 34, 456, 8763};
        System.out.println("Even digit numbers = " + findNumbers(data));
        System.out.println("String Soln ==> Even digit numbers = " + findNumbersUsingString(data));
    }

    public static int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {
            int modul = 0;

            if(num > 10) {
                boolean isTrue = true;
                while (isTrue) {
                    modul++;
                    num /= 10;
                    if(num < 10) {
                        isTrue = false;
                    }
                }
                modul++; // cater fo digit less than 10
                if(modul % 2 == 0) {
                    count++;
                }
            }
        }

        return count;
    }

    public static int findNumbersUsingString(int[] nums) {
        int count = 0;

        for (int num: nums) {
            int length = String.valueOf(num).length();
            if(length % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}
