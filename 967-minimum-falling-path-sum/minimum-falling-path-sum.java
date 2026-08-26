class Solution {
    private int dfs(int i, int j, int[][] grid, Integer dp[][]) {
        if (i >= grid.length || j >= grid[0].length || i < 0 || j < 0)
            return Integer.MAX_VALUE;
        if (i == grid.length - 1)
            return grid[i][j];
        if (dp[i][j] != null)
            return dp[i][j];
        //below
        int one = dfs(i + 1, j, grid, dp);
        int two = dfs(i + 1, j - 1, grid, dp);
        int three = dfs(i + 1, j + 1, grid, dp);
        return dp[i][j] = grid[i][j] + Math.min(one, Math.min(two, three));

    }

    public int minFallingPathSum(int[][] matrix) {
        Integer dp[][] = new Integer[matrix.length + 1][matrix[0].length + 1];
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < matrix[0].length; i++) {
            ans = Math.min(dfs(0, i, matrix, dp), ans);
        }

        return ans;
    }
}