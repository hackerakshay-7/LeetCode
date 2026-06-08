class Solution {
    public int longestOnes(int[] nums, int k) {
        int ans =0;
         int zerocount=0;
         int temp=0,j=0;
        for(int i =0;i<nums.length;i++){
            temp++;
           if(nums[i]==0) zerocount++;
           if(zerocount>k){
            while(zerocount>k){
                if(nums[j]==0) zerocount--;
                j++;
                temp--;
            }
           }
           ans=Math.max(ans,temp);

        }
   return ans; }
}