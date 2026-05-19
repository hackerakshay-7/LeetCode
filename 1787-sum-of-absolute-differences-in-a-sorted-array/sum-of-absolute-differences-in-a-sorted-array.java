class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int left[] = new int[nums.length];
        int right[] = new int[nums.length];
        // single prefix se kaam nahi bana incorrect logic that is
        // left aur right sum ka try kru ?? bcoz array sorted hai
        int leftsum = 0, rightsum = 0;
        for (int i = 0; i < nums.length; i++) {
            left[i] = leftsum;
            leftsum += nums[i];
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            right[i] = rightsum;
            rightsum += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            int add = nums[i] * i - left[i];
            add += (right[i] - (nums[i] * (nums.length - i - 1)));
            nums[i] = add;
        }

        return nums;
    }
}