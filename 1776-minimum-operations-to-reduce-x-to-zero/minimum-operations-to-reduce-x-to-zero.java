class Solution {
    // private int rec(int [] nums , int i ,int j, int x){
    //     if(x==0) return 0;
    //     if(x<0 || i>j ) return Integer.MAX_VALUE;
    //     if(dp[i][j]!=null) return dp[i][j];
    //     int one = rec(nums,i+1,j,x-nums[i]);
    //     int two = rec(nums,i,j-1,x-nums[j]);
    //     if(one!=Integer.MAX_VALUE){ one++;}
    //     if(two!=Integer.MAX_VALUE){ two++;}
    //     return dp[i][j]=Math.min(one,two);
    // }
    // SUM - X KA SABSE BADA SUBARRAY form left and right not random
    public int minOperations(int[] nums, int x) {
        // int a= rec(nums,0,nums.length-1,x,0);
        // return a==Integer.MAX_VALUE ? -1:a;
        int n = nums.length;
        long sum = 0l;
        for(int a : nums) sum+=a;
        if(x>sum) return -1;
        sum-=x;
        if(sum==0) return n; 
        int j =0;
        long sumsuck =0l;
        int ans = -1;
        for(int i =0;i<n;i++){
            sumsuck+=nums[i];
            while(sumsuck>sum){
                sumsuck-=nums[j];
                j++;
            }
            if(sumsuck==sum) ans = Math.max(ans,i-j+1);
        }
   return ans == -1 ? ans :  n-ans;}
}