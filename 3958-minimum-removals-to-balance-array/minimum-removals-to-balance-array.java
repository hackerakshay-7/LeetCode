class Solution {
    public int minRemoval(int[] nums, int k) {
        int count = 0, j =0,i=0,n=nums.length,maxlen=0;
        Arrays.sort(nums);
        while(j<n){
            if((long)nums[i]*k<nums[j]){i++;}
            maxlen=Math.max(maxlen,j-i+1);
            j++;}
  return n-maxlen;  }
}