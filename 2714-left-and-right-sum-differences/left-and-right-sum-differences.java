class Solution {
    public int[] leftRightDifference(int[] nums) {
     int rightsum=0;
     for(int a : nums) rightsum+=a;
     rightsum-=nums[0];
     int leftsum=0;
     for(int i =0;i<nums.length;i++){
        int temp = nums[i];
        nums[i]=Math.abs(leftsum-rightsum);
        leftsum+=temp;
        if(i==nums.length-1) break;
        rightsum-=nums[i+1];
     }
    return nums;}
}