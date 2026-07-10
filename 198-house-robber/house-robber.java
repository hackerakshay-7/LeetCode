class Solution {
    // this is trash try memoizing 
    private int house(int nums[] , int idx , Integer dp[]){
        if(idx==0) return nums[idx];
        if(idx<0) return 0;
        if(dp[idx]!=null) return dp[idx];
        int pick = nums[idx]+house(nums,idx-2,dp);
        int notpick = 0+house(nums,idx-1,dp);
        return dp[idx] =Math.max(pick,notpick);
    }
    public int rob(int[] nums) {
        Integer dp [] = new Integer[nums.length+1];
        return house(nums,nums.length-1 , dp);
       }
}

/**
 int sum1=0,sum2=0;
        for(int i =0;i<nums.length;i+=2){
            sum1+=nums[i];
        }
        for(int j =1;j<nums.length;j+=2){
            sum2+=nums[j];
        }
    return Math.max(sum1,sum2); */