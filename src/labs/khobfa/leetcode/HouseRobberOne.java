package labs.khobfa.leetcode;

/**
 Input: nums = [1,2,3,1]
 Output: 4
 Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
 Total amount you can rob = 1 + 3 = 4.
 */
public class HouseRobberOne {

    private static int rob(int[] A) {
        int prevMax = 0;
        int currMax = 0;
        int tmp;

        for (int x : A) {
            tmp = currMax;
            currMax = Math.max(prevMax + x, currMax);
            prevMax = tmp;
        }

        return currMax;
    }

    public static void main(String[] args) {
        System.out.println(rob(new int[] { 1, 2, 3, 4, 5}));
    }

}