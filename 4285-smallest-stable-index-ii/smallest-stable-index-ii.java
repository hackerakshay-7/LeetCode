class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int min[]= new int [nums.length];
        int min1=Integer.MAX_VALUE;
        for(int i = nums.length-1;i>=0;i--){
            min[i]= Math.min(min1,nums[i]);
            min1=Math.min(min1,nums[i]);
        }
        int max = nums[0];
        for(int i =0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
            if(max-min[i]<=k){
              return i;
            }
        }
    return -1;}
}