class Solution {
    private int rec(int[][] obstacles, Integer dp[][], int i, int j) {
        if(i<0 || j<0 || obstacles[i][j]==1) return 0;
        if(i==0 && j ==0) return 1;
         if(dp[i][j]!=null) return dp[i][j];
        int left = rec(obstacles,dp,i,j-1);
        int up = rec(obstacles,dp,i-1,j);
        return dp[i][j] = left+up;
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        Integer dp[][] = new Integer[obstacleGrid.length][obstacleGrid[0].length];
        return rec(obstacleGrid,dp,obstacleGrid.length-1,obstacleGrid[0].length-1);
    }
}