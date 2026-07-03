class Solution {
    public int maxWidthRamp(int[] nums) {
        Integer idx[] =new Integer [nums.length];
        for(int i =0;i<nums.length;i++){
            idx[i]=i; } 
        Arrays.sort(idx,(a,b)-> Integer.compare(nums[a],nums[b]));
        int minindex = idx[0];
        int max = Integer.MIN_VALUE;
        for(int i  =0;i<nums.length;i++){
            max = Math.max(idx[i]-minindex,max);
            if(idx[i]<minindex) minindex = idx[i];
        }
   return max>0?max:0; }
}