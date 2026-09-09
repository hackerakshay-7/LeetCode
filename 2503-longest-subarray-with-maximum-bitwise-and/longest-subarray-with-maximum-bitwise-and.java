class Solution {
    public int longestSubarray(int[] nums) {
       int max =0;
       int n = nums.length;
       for(int a :nums) max = Math.max(a,max);
       int ans = 1;
       int count =0;
       for(int i =0;i<n;i++){
        if(nums[i]!=max) { count =0;continue; }
        count++;
        ans = Math.max(count,ans);

       }
   return ans; }
}