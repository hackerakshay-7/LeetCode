class Solution {
    private int Echidna(int nums [],int i , int target , int sum , Integer [][] dp,int suck){
            
        if(i==nums.length){
            if(target==sum) return 1;
            return 0;
        }
        if(dp[i][sum+suck]!=null) return dp[i][sum+suck];
        int pick = Echidna(nums,i+1,target,sum-nums[i],dp,suck);
        int drop = Echidna(nums,i+1,target,sum+nums[i],dp,suck);
        return dp[i][suck+sum]=pick+drop;

    }
    public int findTargetSumWays(int[] nums, int target) {
        int sum =0;
        for(int a : nums) sum+=a;
        if(Math.abs(target)>sum) return 0;
        Integer dp[][] = new Integer[nums.length][sum*2+1];
        return Echidna(nums,0,target,0,dp,sum);
    }
}