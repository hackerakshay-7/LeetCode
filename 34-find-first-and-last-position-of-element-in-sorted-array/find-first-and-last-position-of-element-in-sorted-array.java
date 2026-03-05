class Solution {
    int findl(int nums [],int target){
        int ans = -1;
        int s =0;
        int e = nums.length-1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(nums[mid]>=target){ e = mid-1;}
            else{ s = mid+1;}
            if( nums [mid] == target ) ans = mid;
        }
        return ans;
    }
     int findr(int nums [],int target){
          int ans = -1;
        int s =0;
        int e = nums.length-1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(nums[mid]<=target){ s = mid +1;}
            else{ e = mid-1;}
            if( nums [mid] == target ) ans = mid;
        }
        return ans;
     }

    public int[] searchRange(int[] nums, int target) {
       int left= findl(nums,target);
       int right = findr(nums,target);
       return new int []{ left , right};}}