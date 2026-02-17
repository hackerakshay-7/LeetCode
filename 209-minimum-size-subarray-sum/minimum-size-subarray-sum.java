class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0,j=0,sum=0,minlen=Integer.MAX_VALUE;
        while(j<nums.length){
           if(sum<=target) sum+=nums[j++];
            else if(sum>target) { sum-=nums[i++];}
            if(sum>=target) minlen=Math.min(minlen,j-i);
        }
        while(i<nums.length){
            sum-=nums[i++];
            if(sum>=target) minlen=Math.min(minlen,j-i);
        }
 return minlen==Integer.MAX_VALUE?0:minlen; }
}