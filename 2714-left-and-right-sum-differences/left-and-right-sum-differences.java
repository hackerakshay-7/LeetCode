class Solution {
    public int[] leftRightDifference(int[] nums) {
      int ans [] = new int[nums.length];
     int rightsum=0;
     for(int a : nums) rightsum+=a;
     rightsum-=nums[0];
     int leftsum=0;
     for(int i =0;i<nums.length;i++){
        ans[i]=Math.abs(leftsum-rightsum);
        leftsum+=nums[i];
        if(i==nums.length-1) break;
        rightsum-=nums[i+1];
     }
    return ans;}
}