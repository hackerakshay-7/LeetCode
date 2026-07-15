class Solution {
    // private void swap(int i, int[] arr) {
    //     int temp = arr[i];
    //     arr[i] = arr[i + 1];
    //     arr[i + 1] = temp;
    // }

    public boolean canSortArray(int[] nums) {
            for(int i =0;i<nums.length;){
                int j =i;
                while(j<nums.length && Integer.bitCount(nums[i])==Integer.bitCount(nums[j])){j++;}
                Arrays.sort(nums,i,j);
                i=j;
            }
    for(int i = 0;i<nums.length-1;i++) {
        if (nums[i] > nums[i + 1])
            return false;
    }
    return true;
}}