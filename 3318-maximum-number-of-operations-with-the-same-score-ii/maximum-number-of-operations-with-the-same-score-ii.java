class Solution {
    private int suck(int [] arr , int i , int j , int sum ,int[][]dp){
        if(j-i<1) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int a = 0;
        int b = 0;
        int c = 0;
        if(sum == arr[i]+arr[i+1]) a = suck(arr,i+2,j,sum,dp)+1;
        if(sum == arr[i]+arr[j]) b = suck(arr,i+1,j-1,sum,dp)+1;
        if(sum == arr[j]+arr[j-1]) c = suck(arr,i,j-2,sum,dp)+1;

        return dp[i][j]=Math.max(a,Math.max(b,c));

    }
    public int maxOperations(int[] nums) {
        // only three cases take left edge sum -> take right edge sum
        // take corner two elements
        // humara jo first step hoga chahae woh 
        int n = nums.length;
        int dp[][] = new int[n][n];
        for(int []a : dp) Arrays.fill(a,-1);
        int a = suck(nums,2,n-1,nums[0]+nums[1],dp);
        for(int []k : dp) Arrays.fill(k,-1);
        int b = suck(nums,1,n-2,nums[0]+nums[n-1],dp);
        for(int []k : dp) Arrays.fill(k,-1);
        int c =suck(nums, 0 , n-3, nums[n-1]+nums[n-2],dp);
        return Math.max(a,Math.max(b,c))+1;
    }
}