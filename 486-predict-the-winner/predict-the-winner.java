class Solution {
   private boolean dfs(int [] nums , long asum , long bsum, boolean aturn , int s,int e ){
       // if(dp[s][e]!=null) return dp[s][e];
        if(s>e){ return asum>=bsum;}
        if(aturn) asum+=nums[s];
        else{bsum+=nums[s];}
        boolean left = dfs(nums,asum,bsum,!aturn,s+1,e);
         if(aturn) asum+=(nums[e]-nums[s]);
        else{bsum+=(nums[e]-nums[s]);}
        boolean right = dfs(nums,asum,bsum,!aturn,s,e-1);
       if(aturn) return  left|| right;
       else{ return  left&&right;}
   }
    public boolean predictTheWinner(int[] nums) {
        // end idx bhi lena pdega its not always len -idx-1
      //  Boolean dp[][] = new Boolean[nums.length][nums.length];
        return dfs(nums,0,0,true,0,nums.length-1);
    }
}