class Solution {
    public int longestSubsequence(int[] nums) {
       int ans = nums.length;
       int xor = 0;
        int max = 0;
       for(int a:nums) {xor^=a; max = Math.max(a,max);}
       if(max ==0) return 0; 
        else if(xor!=0) return ans;
        else{ return ans-1;}
    }
}