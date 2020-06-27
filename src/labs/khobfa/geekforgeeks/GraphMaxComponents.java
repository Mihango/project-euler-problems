package labs.khobfa.geekforgeeks;

import java.util.Arrays;

public class GraphMaxComponents {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2},
                {3, 4},
                {2, 3}
        };
        System.out.println(Arrays.toString(computeComponents(arr, 4)));
    }

    public static int[] computeComponents(int[][] data, int size) {
        int[] result = new int[size+1];
        int max[] = new int[data.length];

        for (int i = 1; i <= size; i++) {
            result[i] = i;
        }
        System.out.println(Arrays.toString(result));
        for (int[] arr : data) {
            union(arr[0], arr[1], result);
            //
        }

        return result;
    }

    public static void union(int p, int q, int[] data) {
        int pRoot = findRoot(p, data);
        int qRoot = findRoot(q, data);

        if(pRoot == qRoot) return;
        System.out.println("Union >>> " + pRoot + " >>> " + qRoot);
        data[pRoot] = qRoot;
    }

    private static int findRoot(int q, int[] data) {
        while (q != data[q]) q = data[q];
        return q;
    }
}
