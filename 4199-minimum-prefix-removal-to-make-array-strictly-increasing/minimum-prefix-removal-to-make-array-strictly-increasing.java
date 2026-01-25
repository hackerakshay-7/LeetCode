class Solution {
    public int minimumPrefixLength(int[] nums) {
       int i = nums.length-1;
       while(i>0 && nums[i]>nums[i-1]) i--;
    return i;}
}