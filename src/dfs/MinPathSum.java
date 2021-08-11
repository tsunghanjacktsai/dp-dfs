package dfs;

public class MinPathSum {
    public int minPathSum(int[][] grid) {
        return minPathSum(grid, grid.length - 1, grid[0].length - 1);
    }

    private int minPathSum(int[][] grid, int i, int j) {
        if (i == 0 && j == 0) {
            return grid[i][j];
        }

        if (i == 0) {
            return grid[i][j] + minPathSum(grid, i, j - 1);
        }
        if (j == 0) {
            return grid[i][j] + minPathSum(grid, i - 1, j);
        }

        return grid[i][j] + Math.min(minPathSum(grid, i - 1, j), minPathSum(grid, i, j - 1));
    }
}
