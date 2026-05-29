class Solution {
    public int singleNonDuplicate(int[] nums) {
        // i was thinking how binary search
        // single element ke pehle jo double elements honge unka first element even pe hoga
        // whereas vice-versa is also true
        int s = 0, e = nums.length - 1;
        while (s < e) {
            int mid = s + (e - s) / 2;
            if(mid%2!=0) mid--; // we always check the first element of pair
            if(nums[mid]==nums[mid+1]) s=mid+2;
           else e=mid; // we are checking the right wrong side the answer is in left bcoz even index se pair shuru ni hoore
        }
   return nums[s]; }
    
}