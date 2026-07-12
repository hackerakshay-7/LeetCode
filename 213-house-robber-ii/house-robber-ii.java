class Solution {
    private int house(int idx , int [] arr,Integer [] dp){
        if(idx==0) return arr[0];
        if(idx<0) return 0;
        if(dp[idx]!=null) return dp[idx];
        int pick = arr[idx]+house(idx-2,arr,dp);
        int not = 0+house(idx-1,arr,dp);
        return dp[idx]= Math.max(not,pick);
    }
     private int houseT(int idx , int [] arr,Integer [] dp){
        if(idx==1) return arr[1];
        if(idx<=0) return 0;
        if(dp[idx]!=null) return dp[idx];
        int pick = arr[idx]+houseT(idx-2,arr,dp);
        int not = 0+houseT(idx-1,arr,dp);
        return  dp[idx] = Math.max(not,pick);
    }
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        Integer dp1 [] = new Integer[nums.length];
        Integer dp2 [] = new Integer[nums.length];

        int one = house(nums.length-2,nums,dp1); // leaving last element of array
        int two = houseT(nums.length-1,nums,dp2); // leaving first element
        return Math.max(one,two);
    }
}