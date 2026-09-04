class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int [] prefix = new int[n];
        int [] postfix = new int[n];
        int i =0;
        int j =n-1;
        int max = nums[0];
        int min = nums[n-1];
        while(i<n){
            max=Math.max(max,nums[i]);
            prefix[i] = max;
            min = Math.min(min,nums[j]);
            postfix[j] = min;
            i++;j--;
        }
        for(int l =0;l<n;l++){
            if(prefix[l]-postfix[l]<=k) return l;
        }
    return -1;}
}