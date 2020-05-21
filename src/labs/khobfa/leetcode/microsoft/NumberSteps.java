package labs.khobfa.leetcode.microsoft;

public class NumberSteps {

    public static void main(String[] args) {
        System.out.println(countStepsToZero(13));
    }

    public static int countStepsToZero(int n) {
        int count = 0;

        while (n > 0) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n -= 1;
            }
            count++;
        }

        return count;
    }
}
