class Solution {
    void swap(int i,int j,int[]arr){
       int temp =arr[i];
       arr[i]=arr[j];
       arr[j]=temp;
    }
    public int missingNumber(int[] nums) {
       int i=0;
       while(i<nums.length){
        if(nums[i]==i || nums[i]==nums.length){i++;}
        else{swap(i,nums[i],nums);}}   
   for(int j=0;j<nums.length;j++){
    if(nums[j]!=j) return j;
   }
   return nums.length;}
}