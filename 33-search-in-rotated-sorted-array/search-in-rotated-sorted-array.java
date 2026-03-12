class Solution {
    int find(int[] nums) {
        int s = 0, e = nums.length - 1;
        if (nums[s] <= nums[e])
            return nums.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (mid < nums.length - 1 && nums[mid] > nums[mid + 1])
                return mid;

            if (nums[mid] >= nums[s])
                s = mid + 1;
            else
                e = mid - 1;
        }

        return nums.length - 1;
    }

    public int search(int[] nums, int target) {
        int x = find(nums);
        int s = 0, e = x;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] > target)
                e = mid - 1;
            else {
                s = mid + 1;
            }
        }
        s = x+1; e = nums.length-1;
        while (s<=e) {
            int mid = s + ( e - s )/2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                s = mid + 1;
            else {
                e = mid - 1;
            }
        }
        return -1;
    }
}