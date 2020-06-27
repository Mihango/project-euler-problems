package labs.khobfa.geekforgeeks;

public class IslandsDFS {

    public static void main(String[] args) {
        int[][] mat = {
                {1, 1, 1, 0, 0},
                {1, 1, 0, 0, 0},
                {1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}
        };

        System.out.println("Island count " + numIslands(mat));
    }

    public static boolean isSafe(int[][] data, int row, int col, boolean[][] visited) {
        return (row >= 0) && (row < data.length) && (col >= 0) && (col < data.length)
                && (data[row][col] == 1) && !visited[row][col];
    }

    public static void dfs(int[][] data, int row, int col, boolean[][] visited, int[] rowNbr, int[] colNbr) {
        visited[row][col] = true;
        for (int i = 0; i< 8; ++i) {
            if(isSafe(data, row + rowNbr[i], col + colNbr[i], visited)){
                dfs(data, row + rowNbr[i], col + colNbr[i], visited, rowNbr, colNbr);
            }
        }
    }

    public static int countIslands(int[][] data) {
        boolean[][] visited = new boolean[data.length][data.length];
        int count = 0;
        // a node can have 8 neighbours (subtract or add col and row)
        int[] rowNbr = new int[]{-1, -1, -1, 0, 0, 1, 1, 1};
        int[] colNbr = new int[]{-1, 0, 1, -1, 1, -1, 0, 1};

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] == 1) {
                    dfs(data, i, j, visited, rowNbr, colNbr);
//                    dfs(data, i, j);
                    count++;
                }
            }
        }
        return count;
    }

//    public static void dfs(int[][] grid, int row, int col) {
//        if(row < 0 || row >= grid.length || col < 0 ||
//                col >= grid[0].length || grid[row][col] == 0)
//            return;
//
//        grid[row][col] = 0;
//        dfs(grid, row+1, col);
//        dfs(grid, row-1, col);
//        dfs(grid, row, col+1);
//        dfs(grid, row, col-1);
//    }

    static void dfs(int[][] grid, int r, int c) {
        int nr = grid.length;
        int nc = grid[0].length;

        if (r < 0 || c < 0 || r >= nr || c >= nc || grid[r][c] == 0) {
            return;
        }

        grid[r][c] = 0;
        dfs(grid, r - 1, c);
        dfs(grid, r + 1, c);
        dfs(grid, r, c - 1);
        dfs(grid, r, c + 1);
    }

    public static int numIslands(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int nr = grid.length;
        int nc = grid[0].length;
        int num_islands = 0;
        for (int r = 0; r < nr; ++r) {
            for (int c = 0; c < nc; ++c) {
                if (grid[r][c] == 1) {
                    dfs(grid, r, c);
                    num_islands++;
                }
            }
        }

        return num_islands;
    }

}
