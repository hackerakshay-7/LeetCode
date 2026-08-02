class Solution {
    // key -> THE MAXIMUM SCORE DIFF. THE CURRENT PLAYER CAN ACHIEVE OVER THE OTHER PLAYER
    // not individual score just the difference among them
    private int dfs(int[]piles,int left , int right,Integer [][] dp){
        if(left==right){return piles[left];}
        if(dp[left][right]!=null) return dp[left][right];
        int leftcall = piles[left]-dfs(piles,left+1,right,dp);
        int rightcall = piles[right]-dfs(piles,left,right-1,dp);
        return dp[left][right] = Math.max(leftcall,rightcall);
       
    }
    public boolean stoneGame(int[] piles) {
        int n = piles.length;
        Integer dp [][] = new Integer[n][n];
        return 0<dfs(piles,0,n-1,dp);
    }
}