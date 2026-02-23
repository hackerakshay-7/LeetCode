class Solution {
    void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int firstMissingPositive(int[] nums) {
        int i = 0;
        int max = Integer.MIN_VALUE;
        while (i < nums.length) {
            if (nums[i] > 0 && nums[i] < nums.length && nums[nums[i] - 1] != nums[i]) {
                swap(nums, i, nums[i] - 1);
                max = Math.max(max, nums[i]);
            } else {
                max = Math.max(max, nums[i]);
                i++;
            }

        }
        if (nums[0] != 1)
            return 1;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[j - 1] + 1)
                return j + 1;
        }
        return max + 1;
    }
}