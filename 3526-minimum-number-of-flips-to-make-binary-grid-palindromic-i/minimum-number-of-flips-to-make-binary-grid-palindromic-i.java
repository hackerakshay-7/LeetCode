class Solution {
    private int rowstep(int [][] grid){
        int steps =0;
        for(int i =0;i<grid.length;i++){
            int j =0,k=grid[0].length-1;
            while(j<k){
                if(grid[i][j]!=grid[i][k]) steps++;
                j++;
                k--;
            }
        }
        return steps;
    }
    private int columnstep(int [][] grid){
        int steps =0;
        for(int i =0;i<grid[0].length;i++){
            int j =0,k=grid.length-1;
            while(j<k){
                if(grid[j][i]!=grid[k][i]) steps++;
                j++;
                k--;
            }  
        }
        return steps;
    }
    public int minFlips(int[][] grid) {
        // double greedy
    return Math.min(rowstep(grid),columnstep(grid));
    }
}