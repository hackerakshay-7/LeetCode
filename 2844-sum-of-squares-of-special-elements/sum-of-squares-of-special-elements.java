class Solution {
    public int sumOfSquares(int[] nums) {
       int  ans=0,
            n=nums.length;
            if(n==1) return nums[0]*nums[0];
      for(int i =1;i*i<=n;i++){
        if(n%(i)==0){
            ans+=(nums[i-1]*nums[i-1]);
            if(n/i!=i){
            ans+=(nums[n/i -1]* nums[n/i-1]);
        }
        }
        
      }
    return ans;}
}