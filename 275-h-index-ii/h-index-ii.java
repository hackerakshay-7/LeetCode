class Solution {
    public int hIndex(int[] nums) {
        int n = nums.length;
        int s =0;
        int e = n-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(nums[mid]>=n-mid) e=mid-1;
            else{s=mid+1;}
        }
   return n-s; }
}