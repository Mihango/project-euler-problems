package labs.khobfa.geekforgeeks;

public class SecondSmallest {

    private static int findSecondSmallest(int[] A) {
        int a;
        int b;

        if (A[0] < A[1]) {
            a = A[0];
            b = A[1];
        } else {
             a = A[1];
            b = A[0];
        }

        for (int i = 2; i < A.length; i++) {
            if (A[i] < a) {
                b = a;
                a = A[i];
            } else {
                if (A[i] < b && A[i] != a) {
                    b = A[i];
                }
            }
        }
        System.out.println("smallest >>>> " + a + " second smallest >>>> " + b);
        return b;
    }

    public static void main(String[] args) {
        System.out.println("Second smallest === " + findSecondSmallest(new int[] {12, 13, 1, 10, 34, 1}));
    }
}
