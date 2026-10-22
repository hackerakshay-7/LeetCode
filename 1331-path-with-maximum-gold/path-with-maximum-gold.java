class Solution {
    private int dfs(int[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0)
            return 0;
        int gold = grid[i][j];
        grid[i][j] = 0;
        int left = dfs(grid, i, j - 1);
        int right = dfs(grid, i, j + 1);
        int up = dfs(grid, i - 1, j);
        int down = dfs(grid, i + 1, j);

        grid[i][j] = gold;
        return Math.max(left, Math.max(right, Math.max(up, down))) + grid[i][j];

    }

    public int getMaximumGold(int[][] grid) {
        int max = 0;
        // boolean isv[][] = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] != 0)
                    max = Math.max(max, dfs(grid, i, j));
            }
        }
        return max;
    }
}