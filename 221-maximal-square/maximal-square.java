class Solution {
    private int dfs(char [][] mat , int i , int j,int [][] dp){
       if(i>=mat.length || j>= mat[0].length) return 0;
       if(mat[i][j] == '0') return 0;
       if(dp[i][j]!=-1) return dp[i][j];
       int right= dfs(mat,i,j+1,dp);
       int diagonal = dfs(mat,i+1,j+1,dp);
       int left = dfs(mat,i+1,j,dp);
       return dp[i][j] = 1+Math.min(diagonal,Math.min(right,left));

    }
    public int maximalSquare(char[][] matrix) {
        int max =0;
        int dp[][] = new int[matrix.length][matrix[0].length];
        for(int[]a : dp){ Arrays.fill(a,-1);}
        for( int i =0;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                if(matrix[i][j]!='0') 
                max = Math.max(max ,dfs(matrix,i,j,dp));
            }
        }
   return max*max; }
}