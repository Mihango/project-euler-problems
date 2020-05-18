package labs.khobfa.geekforgeeks;

public class CircularConsecutiveOnes {
    public static void main(String[] args) {
        int[] data = {1, 1, 1, 1, 1,1};
        System.out.println("Circular Ones = " + circularMaxConsecutive(data, data.length));
        System.out.println("Circular Ones = " + geekSolutionCircular(data, data.length));
    }

    public static int circularMaxConsecutive(int[] nums, int n) {
        boolean isCircular = nums[0] == 1 && nums[n-1] == 1;
        boolean isFirst = true;

        int max = 0;
        int count = 0;

        int initialMax = 0;
        int lastMax = 0;

        for(int i=0; i < n; i++) {
            if(nums[i] == 1) {
                count += 1;
                if(i == n - 1 && isCircular) {
                    lastMax = initialMax + count;
                }
            } else {
                if(isFirst) {
                    initialMax = count;
                    isFirst = false;
                }
                max = count;
                count = 0;
            }
        }

        return Math.max(Math.max(max, count), lastMax);
    }

    public static int geekSolutionCircular(int[] nums, int n) {
        // starting index
        int start = 0;
        int result = 0;

        int preCnt = 0; // count the first consecutive ones
        while(start < n && nums[start] == 1) {
            preCnt++;
            start++;
        }

        int end = n -1;

        int suffCount = 0; // ones from last index
        while (end >= 0 && nums[end] == 1) {
            suffCount++;
            end--;
        }

        if(start > end) {
            return n;
        }

        int midCount = 0;
        for (int i = start; i<= end; i++) {
            if(nums[i] == 1) {
                midCount++;
                result = Math.max(result, midCount);
            } else {
                midCount = 0;
            }
        }

        return Math.max(result, preCnt + suffCount);
    }
}
