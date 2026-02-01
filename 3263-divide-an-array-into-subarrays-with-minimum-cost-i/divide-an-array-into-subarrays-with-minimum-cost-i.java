class Solution {
    public int minimumCost(int[] nums) {
        int max1 = nums[0], max2 =51, max3 = 51;
        for (int i = 1; i < nums.length; i++) {
            int copy = max2;
            if (max2 > nums[i]) {
                max2 = nums[i];
                max3 = Math.min(copy, max3);
            } else {
                max3 = Math.min(max3, nums[i]);
            }

        }
        return max1 + max2 + max3;
    }
}