package labs.khobfa.geekforgeeks;

public class BitFlip {

    public static void main(String[] args) {
        int[] flip = { 0, 0, 1, 0, 1, 1, 0};
        System.out.println(flipZerosAndOnes(flip));
    }

    // find maximum number of zero after flipping
    public static int flipZerosAndOnes(int[] arr) {
        int count = 0;
        int maxOnes = 0;
        int oneCounts = 0;
        boolean wasOneLast = false;

        for (int value : arr) {
            if (value == 0) {
                count++;
                wasOneLast = false;
                maxOnes = Math.max(maxOnes, oneCounts);
                oneCounts = 0;
            } else {
                if (!wasOneLast) {
                    wasOneLast = true;
                }
                oneCounts++;
            }
        }

        return count + Math.max(oneCounts, maxOnes);
    }
}
