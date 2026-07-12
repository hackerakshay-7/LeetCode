class Solution {
   private int dp(int nums[]){
    int prev2=0;
    int prev=nums[0];
    int curri =0;
    for(int i =1;i<nums.length;i++){
        int take = nums[i];
        if(i>1) take+=prev2;
        int nottake = 0+ prev;
        curri=Math.max(take,nottake);
        prev2=prev;
        prev=curri;
    }
    return prev;
   }
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int temp1 []= new int [nums.length-1];
        int templ []= new int [nums.length-1];
       for(int i =0;i<nums.length;i++){
            if(i!=0) temp1[i-1] = nums[i];
            if(i!=nums.length-1) templ[i]=nums[i];
       }
       int one = dp(temp1);
       int two = dp(templ);
        return Math.max(one,two);
    }
}