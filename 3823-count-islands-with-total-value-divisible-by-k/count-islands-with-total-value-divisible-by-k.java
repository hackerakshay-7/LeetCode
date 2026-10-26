class Solution {
    private long rec(int [][] grid , int i , int j){
        if(i<0||j<0||i>=grid.length||j>=grid[0].length || grid[i][j]==0) 
        {
            return 0;
        }
        int add = grid[i][j];
        grid[i][j] = 0;
        long left = rec(grid,i,j-1);
        long right = rec(grid,i,j+1);
        long up= rec(grid,i-1,j);
        long down = rec(grid,i+1,j);

        return left+right+up+down+add;

    }
    public int countIslands(int[][] grid, int k) {
        int ans =0;
        int n = grid.length;
        int m = grid[0].length;
       // boolean isv[][] = new boolean[n][m];
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                if( grid[i][j]!=0 ){
                     long sum = rec(grid,i,j);
                     if(sum%k==0) ans++;
                }
            }
        }
    return ans;}
}