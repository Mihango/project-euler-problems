package labs.khobfa.hackerank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {

    public static void main(String[] args) {
        List<List<Integer>> array = new ArrayList<>();
//        array.add(Arrays.asList(2, 3, 4));
//        array.add(Arrays.asList(4, 5, 6));
//        array.add(Arrays.asList(9, 8, 9));
        array.add(Arrays.asList(6, 6, 7, -10, 9, -3, 8, 9, -1));
        array.add(Arrays.asList(9, 7, -10, 6, 4, 1, 6, 1, 1));
        array.add(Arrays.asList(-1, -2, 4, -6, 1, -4, -6, 3, 9));
        array.add(Arrays.asList(-8, 7, 6, -1, -6, -6, 6, -7, 2));
        array.add(Arrays.asList(-10, -4, 9, 1, -7, 8, -5, 3, -5));
        array.add(Arrays.asList(-8, -3, -4, 2, -3, 7, -5, 1, -5));
        array.add(Arrays.asList(-2, -7, -4, 8, 3, -1, 8, 2, 3));
        array.add(Arrays.asList(-3, 4, 6, -7, -7, -8, -3, 9, -6));
        array.add(Arrays.asList(-2, 0, 5, 4, 4, 4, -3, 3, 0));



        System.out.println(diagonalDifference(array));
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        int size = arr.size();

        int leftDiagonalSum = 0;
        int rightDiagonalSum = 0;

        for (int i = 0; i < size; i++) {
            List<Integer> innerList = arr.get(i);

            leftDiagonalSum += innerList.get(i);
            rightDiagonalSum += innerList.get(size - i - 1);
        }

        return Math.abs(rightDiagonalSum - leftDiagonalSum);
    }
}
