class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        int ans = 0;
        int dp[][] = new int[grid.length][grid[0].length];
        int xdp[][] = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int add = 0;
                    if (grid[i][j] == 'X') {
                        add = 1;
                    }
                     else if (grid[i][j] == 'Y')
                        add = -1;
                int xhai = grid[i][j]=='X'? 1:0;
                if (i == 0 && j == 0) {
                   dp[i][j] = add;
                   xdp[i][j] = xhai;
                }
               else if (i == 0) {
                    dp[i][j] = dp[i][j - 1] + add;
                    xdp[i][j] = xdp[i][j-1] + xhai;
                } else if (j == 0) {
                    dp[i][j] = dp[i - 1][j] + add;
                    xdp[i][j] = xdp[i-1][j] + xhai;
                } else {
                 dp[i][j] = dp[i - 1][j] + dp[i][j - 1] + add - dp[i - 1][j - 1];
                 xdp[i][j] = xdp[i-1][j] + xdp[i][j-1] - xdp[i-1][j-1] + xhai;
                }

                if (xdp[i][j]>0 && dp[i][j] == 0)
                    ans++;
            }
        }
        return ans;
    }
}