class Solution {

    static void reverse(int [] nums, int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start]=nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public void rotate(int[] nums, int k) {

        k = k%nums.length;

        //reverse first nums.length - k element
        reverse(nums, 0, nums.length - k -1);

        //reverse last k element
        reverse(nums, nums.length-k, nums.length-1); 

        //reverse whole array 
        reverse(nums, 0, nums.length-1);
    }
}