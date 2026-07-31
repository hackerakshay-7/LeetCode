class Solution {
    public int minPathSum(int[][] grid) {
        Integer dp[][] = new Integer[grid.length][grid[0].length];
        // return dfs(grid, 0, 0, dp);
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(i==0 && j==0) dp[0][0] = grid[0][0];
                else{
                int left = Integer.MAX_VALUE;
                int up = Integer.MAX_VALUE;
               if(i>0) left = grid[i][j]+dp[i-1][j];
                if(j>0) up = grid[i][j] + dp[i][j-1];
                dp[i][j] = Math.min(up,left);}
            }
        }
   return dp[m-1][n-1]; }
}