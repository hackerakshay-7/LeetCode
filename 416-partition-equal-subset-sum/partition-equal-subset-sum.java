class Solution {
    private boolean is(int [] nums , int a , int mysum , int tar , Boolean dp[][]){
        if(mysum == tar) return true;
        else if(mysum>tar) return false;
        if(a==nums.length){
            return false;
        }
        if(dp[a][mysum]!=null) return dp[a][mysum];
        return dp[a][mysum]=is(nums,a+1,mysum,tar,dp) || is(nums,a+1,mysum+nums[a],tar,dp);

    }
    public boolean canPartition(int[] nums) {
        int sum =0;
        for(int a : nums) sum+=a;
        if(sum%2!=0) return false;
        int target = sum/2;
        Boolean dp[][] = new Boolean[nums.length][target+1];
        return is(nums,0,0,target,dp);

    }
}