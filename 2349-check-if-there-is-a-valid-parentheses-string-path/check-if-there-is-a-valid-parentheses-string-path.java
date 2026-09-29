class Solution {
    Boolean dp[][][];
    // private boolean isv(String s){
    //     Stack<Character> st = new Stack<>();
    //     for(int i =0;i<s.length();i++){
    //         if(s.charAt(i)=='(') st.push('(');
    //         else if(s.charAt(i)==')' && (!st.isEmpty() &&st.peek()=='(')) st.pop();
    //         else { return false;}
    //     }
    //     return st.isEmpty();
    // }
    private boolean dfs(char [][] grid , int i , int j , int balance){
        int n = grid.length;
        int m = grid[0].length;
        if(i>=n || j>=m) return false;
        if(grid[i][j]=='(') balance++;
        if(grid[i][j]==')') balance--;
        if(balance<0) return false;
        if(i==n-1 && j==m-1 && balance == 0) return true;
        if(dp[i][j][balance]!=null) return dp[i][j][balance];
        return dp[i][j][balance]=dfs(grid,i,j+1,balance) || dfs(grid,i+1,j,balance); 
    }
    public boolean hasValidPath(char[][] grid) {
         int n = grid.length;
        int m = grid[0].length;
        dp = new Boolean[n][m][n+m];
        return dfs(grid,0,0,0);

    }
}