class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length-1;
        for(int i=nums[0];i!=1;i--){
            if(nums[n]%i==0 && nums[0]%i==0){return i;}
        }
    return 1;}
}