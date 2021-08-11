package dfs;

public class MaxAreaOfIsland {
    public int maxAreaOfIsland(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        int maxArea = 0, m = grid.length, n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    int area = getArea(grid, m, n, i, j);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }

        return maxArea;
    }

    private int getArea(int[][] grid, int m, int n, int i, int j) {
        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == 0) {
            return 0;
        }

        grid[i][j] = 0;

        int upArea = getArea(grid, m, n, i - 1, j);
        int downArea = getArea(grid, m, n, i + 1, j);
        int leftArea = getArea(grid, m, n, i, j - 1);
        int rightArea = getArea(grid, m, n, i, j + 1);

        return 1 + upArea + downArea + leftArea + rightArea;
    }
}
