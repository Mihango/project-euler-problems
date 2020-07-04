package labs.khobfa.leetcode;

public class PlusOneArray {
    private static int[] plusOne(int[] digits) {
        int l = digits.length;

        for(int i = l -1; i >= 0; --i) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i] = ++digits[i];
                return digits;
            }
        }

        // if we reach here then all digit were 9
        digits = new int[l + 1]; // initialize making all values = 0 - default int values
        digits[0] = 1;
        return digits;
    }

    private static void print(int[] arr) {
        for (int a : arr) {
            System.out.print(a);
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 4};
        int[] b = new int[]{9, 9, 9};
        int[] c = new int[]{3, 9, 9};

        System.out.print("(");
        print(a);
        System.out.print(") + 1 = ");
        print(plusOne(a));
        System.out.println();

        System.out.print("(");
        print(b);
        System.out.print(") + 1 = ");
        print(plusOne(b));
        System.out.println();

        System.out.print("(");
        print(c);
        System.out.print(") + 1 = ");
        print(plusOne(c));
        System.out.println();
    }
}
