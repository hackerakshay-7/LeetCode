class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==1) return 0;
        if(nums[0]>nums[1])return 0;
        if(nums[nums.length-1]>nums[nums.length-2]) return nums.length-1;
        int s =0,e=nums.length-1;
      while(s<=e){
        if(s==e) return s;
        int mid = s + (e - s)/2;
        if(nums[mid]>nums[mid+1]){ e =mid;}
        else{ s = mid+1;}
      }
   return -1; }
}