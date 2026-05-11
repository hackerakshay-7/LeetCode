class Solution {
    void dfs(char [][] grid,int i , int j){
        grid[i][j]='0';
        if(i+1<grid.length && grid[i+1][j]=='1') dfs(grid,i+1,j);
        if(i-1>=0 && grid[i-1][j]=='1') dfs(grid,i-1,j);
        if(j+1<grid[0].length && grid[i][j+1]=='1') dfs(grid,i,j+1);
        if(j-1>=0 && grid[i][j-1]=='1') dfs(grid,i,j-1);
    }
    public int numIslands(char[][] grid) {
       //do dfs bitch 
       // jaise hi ek 1 "island" mile waise hi uske adjacent 1s ko zero krdo using dfs
       //repeat the process and return count
       int count =0;
       for(int i=0;i<grid.length;i++){
        for(int j =0;j<grid[i].length;j++){
            if(grid[i][j]=='1') {dfs(grid,i,j);
            count++;}
        }
       } 
    return count;}
}