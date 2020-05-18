package labs.khobfa.lettcode;

public class ConsecutiveOnes {

    public static void main(String[] args) {
        int[] data = {1,1,0,1,1,1};
        System.out.println("Consecutive ones = " + consecutiveOnes(data));
    }

    public static int consecutiveOnes(int[] nums) {
        int max = 0;
        int lastMax = 0;

        for(int i =0; i< nums.length; i++) {
            if(nums[i] == 1) {
                max += 1;
            } else {
                if(lastMax < max) {
                    lastMax = max;
                }
                max = 0;
            }
        }

        return Math.max(max, lastMax);
    }
}
