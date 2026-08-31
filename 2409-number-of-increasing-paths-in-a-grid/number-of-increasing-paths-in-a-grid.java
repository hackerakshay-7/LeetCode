class Solution {
    // non optimized beats 50 and is in the fake account use for recall purpose
    static final int MOD = 1000_000_007;
    private int dfs(int [][] grid , int i , int j,Integer [][] dp){
        if(dp[i][j]!=null) return dp[i][j];
        long ans =1;
        if(j>0 && grid[i][j-1] > grid[i][j])
        ans+=dfs(grid,i,j-1,dp);
        if(j<grid[0].length-1 && grid[i][j+1]>grid[i][j])
        ans+=dfs(grid,i,j+1,dp);
        if(i>0 && grid[i-1][j]>grid[i][j])
          ans+=dfs(grid,i-1,j,dp);
        if(i<grid.length-1 && grid[i+1][j]>grid[i][j])
           ans+=dfs(grid,i+1,j,dp);
           return dp[i][j] = (int)(ans%MOD);

    }
    public int countPaths(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int ans=0;
        Integer dp [][]= new Integer[m][n]; 
       for(int i =0;i<grid.length;i++){
        for(int j =0;j<grid[0].length;j++){
            ans= (ans+ (dfs(grid,i,j,dp))%MOD)%MOD;
        }
     }
   return ans; }
}