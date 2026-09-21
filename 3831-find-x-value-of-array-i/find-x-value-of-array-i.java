class Solution {
    public long[] resultArray(int[] nums, int k) {
        long ans [] = new long[k];
        long prev [] = new long[k];


        for(int i =0;i<nums.length;i++){
            long temp [] = new long[k];
            int currem = nums[i]%k;
            temp[currem]++;

            for(int oldrem =0;oldrem<k;oldrem++){
                int newrem = (oldrem*currem)%k;
                temp[newrem]+=prev[oldrem]; 
            }
            prev = temp;
            for(int x =0;x<k;x++){
                ans[x]+=prev[x];
            }
        }
        return ans;
    }
}