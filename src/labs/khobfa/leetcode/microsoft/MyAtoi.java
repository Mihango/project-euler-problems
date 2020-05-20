package labs.khobfa.leetcode.microsoft;

public class MyAtoi {

    public static void main(String[] args) {
        System.out.println(myAtoi("-91283472332"));
        System.out.println(myAtoi("43"));
        System.out.println(Integer.MAX_VALUE);
    }

    public static int myAtoi(String str) {

        if(str == null || str.length() == 0) {
            return 0;
        }

        boolean isNegative = false;

        int count = 0;
        int result = 0;


        for(int i = 0; i < str.length(); i++) {
            while(str.charAt(i) == ' ') i++;

            if(count == 0 && !((str.charAt(i) >= '0' && str.charAt(i) <= '9') || str.charAt(i) == '-' ))
                return 0;

            if(count == 0 && str.charAt(i) == '-') {
                isNegative = true;
                i++;
            }

            if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                int current = Character.getNumericValue(str.charAt(i));
                if((long)(result * 10) + current > (long) Integer.MAX_VALUE + 1) {
                    result = (result * 10) + current;
                    count++;
                } else {
                    return isNegative ? -Integer.MAX_VALUE : Integer.MAX_VALUE;
                }
            }
        }

        return isNegative && result > 0 ? -result : result;
    }
}
