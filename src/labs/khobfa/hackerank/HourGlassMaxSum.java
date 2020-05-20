package labs.khobfa.hackerank;

public class HourGlassMaxSum {

    /** hour glass is in the form of
     *      1   1   1
     *          1
     *      1   1   1
     *      It contains 3 rows and 3 columns --> the middle row has one item
     *      For any matrix an you can check how many hour glass it can contain
     *      by (row - 2) * (col * 2)
     */

    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3, 0, 0},
                {0, 0, 0, 0, 0},
                {2, 1, 4, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 1, 0, 1, 0}};
        int res = findMaxSum(mat, 5, 5);
        System.out.println("Total >>>> " + res);
    }

    public static int findMaxSum(int[][] mat, int rows, int cols) {
        // if rows or cols are less than 3 return -1
        if(rows < 3 || cols < 3) {
            return -1;
        }

        int total = 0;

        for (int i = 0; i < rows-2; i++) {
            for (int j = 0; j < cols -2; j++) {
                int sum = mat[i][j] + mat[i][j+1] + mat[i][j+2] +
                                 mat[i+1][j+1] +
                        mat[i+2][j] + mat[i+2][j+1] + mat[i+2][j+2];

                if(sum > total) {
                    total = sum;
                }
            }
        }
        return total;
    }
}
