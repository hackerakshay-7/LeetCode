class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int arr[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
          int p = ((nums[i]+i)%nums.length +nums.length) %nums.length;
          arr[i]= nums[p];
        }
        return arr;
    }
}