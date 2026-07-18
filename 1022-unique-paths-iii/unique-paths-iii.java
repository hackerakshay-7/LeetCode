class Solution {
    private int dfs(int[][] grid, int i, int j, boolean[][] isv, int points) {
        if (i < 0 || j < 0 || i == grid.length || j == grid[0].length || grid[i][j] == -1 || isv[i][j])
            return 0;
        isv[i][j] = true;
        points--;
        if (grid[i][j] == 2) {
            isv[i][j] = false;
            return points == 0 ? 1 : 0;
        }
        int left = dfs(grid, i, j - 1, isv, points);
        int right = dfs(grid, i, j + 1, isv, points);
        int up = dfs(grid, i - 1, j, isv, points);
        int down = dfs(grid, i + 1, j, isv, points);
        isv[i][j] = false;
        return left + right + up + down;
    }

    public int uniquePathsIII(int[][] grid) {
        boolean isv[][] = new boolean[grid.length][grid[0].length];
        int starti = 0, startj = 0, points = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] != -1)
                    points++;
                if (grid[i][j] == 1) {
                    starti = i;
                    startj = j;
                }
            }

        }
        return dfs(grid, starti, startj, isv, points);
    }
}