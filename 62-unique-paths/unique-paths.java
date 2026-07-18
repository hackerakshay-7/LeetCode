class Solution {
//    private int dfs(Integer dp [][], int x , int y){
//      if(x<1 || y<1) return 0;
//         if(x==1 && y== 1) return 1;
//         if(dp[x][y]!=null) return dp[x][y];
//        int right= dfs(dp,x-1,y);
//       int left =  dfs(dp,x,y-1);
//         return dp[x][y]=right + left;
//     }
        // TABULATION
    public int uniquePaths(int m, int n) {
      Integer dp [][] = new Integer [m][n];
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                if(i==0 && j ==0) dp[i][j] =1;
                else{
                    int up =0;
                    int left =0;
                    if(j>0) left = dp[i][j-1];
                    if(i>0) up = dp[i-1][j];
                     dp[i][j] = left+up;
                }
            }
        }
   return dp[m-1][n-1]; }
}