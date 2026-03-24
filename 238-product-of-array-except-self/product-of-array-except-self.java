class Solution {
    public int[] productExceptSelf(int[] nums) {
     int preproduct[] = new int[nums.length];
     int postproduct[]=new int[nums.length];
     int pre=1;
     int post=1;
     for(int i=0,j=nums.length-1;i<nums.length;i++,j--){
        preproduct[i]=pre;
        pre=pre*nums[i];
        postproduct[j]=post;
        post=post*nums[j];

     }  
     for(int i =0;i<nums.length;i++){
        nums[i]=preproduct[i]*postproduct[i];
     } 
  return nums;  }
}