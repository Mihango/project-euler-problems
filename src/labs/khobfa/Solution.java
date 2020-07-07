package labs.khobfa;

import java.util.*;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for(int i =0; i < A.length; i++) {
            if(map.containsKey(A[i])) {
                int v = map.get(A[i]) + 1;
                map.put(A[i], v);
            } else {
                map.put(A[i], 0);
            }
        }

        System.out.println("Size >>> " + map.size());

        Iterator it = map.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry<Integer, Integer> entry = (Map.Entry<Integer, Integer>) it.next();
            if(entry == null) {
                System.out.println("Enry is null");
            }
            assert entry != null;
            int v = entry.getValue();
            int result = 0;
            while(v > 0) {
                result += v;
                v--;
            }
            count += result;
        }

        return count;
    }

    public static void main(String[] rgs) {
//        Solution solution = new Solution();
//        System.out.println(solution.solution(new int[]{3, 5, 6, 3, 3, 5}));
//        System.out.println(getDecimal(4672));
//        int count = 2;
//        int num2 = 0;
//        num2 += (5) * (count > 0 ? count * 10 : 1);
//        System.out.println(num2);
    }

    public static int getDecimal(int binary){
        int decimal = 0;
        int n = 0;
        while(true){
            if(binary == 0){
                break;
            } else {
                int temp = binary%10;
                decimal += temp*Math.pow(2, n);
                binary = binary/10;
                n++;
            }
        }
        return decimal;
    }
}
