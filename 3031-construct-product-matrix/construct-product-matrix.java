class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        long prefix[][] = new long[grid.length][grid[0].length];
        long suffix[][] = new long[prefix.length][prefix[0].length];
        long pre=1;
        long post=1;
        for(int i=0,j=grid.length-1;i<grid.length;i++,j--){
            for(int k=0,l=grid[0].length-1;k<grid[0].length;k++,l--){
                prefix[i][k] = pre;
                pre=pre*grid[i][k]%12345;
                suffix[j][l]=post;
                post=post*grid[j][l]%12345;
            }
        }
        for(int i =0;i<grid.length;i++){
            for(int j =0;j<grid[0].length;j++){
                grid[i][j] = (int)(prefix[i][j]*suffix[i][j])%12345;
            }
        }
  return grid;  }
}