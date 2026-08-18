class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
       int arr [] = new int[51];
       for(int a : nums) arr[a]++;
       if(k<n && k!=1){
        int a = nums[0];
        int b = nums[n-1];
        if(arr[a]==1 && arr[b] ==1) return Math.max(a,b);
        if(arr[a]==1 && arr[b]>1) return a;
        if(arr[b]==1 && arr[a]>1) return b; 
       }
       int ans =-1;
       if(k==1){
            for(int i =0;i<n;i++){
      if(arr[nums[i]]==1) ans = Math.max(ans,nums[i]);}
       }
       else if(k==n){for(int i =0;i<n;i++){
       ans = Math.max(ans,nums[i]);
       }}
    return ans;}
}