class Solution {
    // int ans =Integer.MAX_VALUE;
    private int dfs(int[][] grid, int i, int j, Integer[][] dp) {
        if (i >= grid.length || j >= grid[0].length)
            return Integer.MAX_VALUE;
        if (i == grid.length - 1 && j == grid[0].length - 1)
            return grid[i][j];
        if (dp[i][j] != null)
            return dp[i][j];
        int right = dfs(grid, i + 1, j, dp);
        int down = dfs(grid, i, j + 1, dp);
        dp[i][j] = grid[i][j] + Math.min(down, right);
        return dp[i][j];
    }

    public int minPathSum(int[][] grid) {
        Integer dp[][] = new Integer[grid.length][grid[0].length];
        return dfs(grid, 0, 0, dp);
    }
}

/**
// did recursion all by ma self-->>
  private void dfs(int[][] grid , int[]ans , int i , int j,int sum){
        if(i>=grid.length ||j>=grid[0].length || i<0 || j<0) return;
        if(i==grid.length-1 && j==grid[0].length-1){
            ans[0]=Math.min(ans[0],sum+grid[i][j]);
            return;
        }
        dfs(grid,ans,i+1,j,sum+grid[i][j]);
        dfs(grid,ans,i,j+1,sum+grid[i][j]);

    }
    public int minPathSum(int[][] grid) {
        int [] ans = {Integer.MAX_VALUE};
        dfs(grid,ans,0,0,0);
   return ans[0]; */