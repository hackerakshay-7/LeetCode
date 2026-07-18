class Solution {
    // private int rec(int[][] obstacles, Integer dp[][], int i, int j) {
    //     if(i<0 || j<0 || obstacles[i][j]==1) return 0;
    //     if(i==0 && j ==0) return 1;
    //      if(dp[i][j]!=null) return dp[i][j];
    //     int left = rec(obstacles,dp,i,j-1);
    //     int up = rec(obstacles,dp,i-1,j);
    //     return dp[i][j] = left+up;
    // }
    // RECURSION STACK SPACE HATAO

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int a = obstacleGrid.length;
        int b = obstacleGrid[0].length;
        Integer dp[][] = new Integer[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (obstacleGrid[i][j] == 1)
                    dp[i][j] = 0;
                else if (i == 0 && j == 0)
                    dp[i][j] = 1;
                else {
                    int up = 0;
                    int left = 0;
                    if (i > 0)
                        up = dp[i - 1][j];
                    if (j > 0)
                        left = dp[i][j - 1];
                    dp[i][j] = left + up;
                }

            }
        }
        return dp[a - 1][b - 1];
    }
}