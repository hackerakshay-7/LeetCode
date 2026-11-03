class Solution {
    public int minMoves(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int a : nums){
            max = Math.max(a,max);
        }
        int ans =0 ;
        for(int a : nums){
            ans+=(max-a);
        }
    return ans;}
}