class Solution {
   private int dfs(Integer dp [][], int x , int y){
     if(x<1 || y<1) return 0;
        if(x==1 && y== 1) return 1;
        if(dp[x][y]!=null) return dp[x][y];
       int right= dfs(dp,x-1,y);
      int left =  dfs(dp,x,y-1);
        return dp[x][y]=right + left;
    }
    public int uniquePaths(int m, int n) {
      Integer dp [][] = new Integer [m+1][n+1];
        return dfs(dp,m,n);
    }
}