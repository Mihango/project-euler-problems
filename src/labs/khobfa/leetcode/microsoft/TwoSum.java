package labs.khobfa.leetcode.microsoft;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// return indices of the two numbers sum to target
public class TwoSum {

    public static void main(String[] args) {
        int[] data = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSums(data, target);
        System.out.println("Result >>>> " + Arrays.toString(result));
    }

    public static int[] twoSums(int[] nums, int target) {
        boolean isFound = false;
        int i = 0;
        int j = i + 1;

        for (i = 0; i < nums.length - 1; i++) {
            for (j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    isFound = true;
                    break;
                }
            }
            if (isFound) break;
        }
        return isFound ? new int[]{i, j} : new int[]{-1, -1};
    }


//    public static int[] twoSums(int[] nums, int target) {
//        boolean isFound = false;
//        int[] result = new int[2];
//
//        for(int i = 0; i < nums.length - 1; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    result[0] = i;
//                    result[1] = j;
//                    isFound = true;
//                    break;
//                }
//            }
//            if(isFound)
//                break;
//        }
//
//        return isFound ? result : new int[]{-1, -1};
//    }


    public static int[] twoSumsOptimized(int[] nums, int target) throws Exception {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{i, map.get(target - nums[i])};
            }
            map.put(nums[i], i);
        }
        throw new Exception("No available matching sum of target " + target);
    }
}
