class Solution {
    public int minPatches(int[] nums, int n) {
        long expectedsum = 1l;
        long sumformed = 0l;
        int patch = 0;
        int i = 0;
        while (sumformed < n) {
            if (sumformed >= expectedsum)
                expectedsum=sumformed+1;
            else {
                if (i < nums.length && nums[i] <= expectedsum) {
                    sumformed += nums[i];
                    i++;
                } else {
                    patch++;
                    // hypothetically add krdiya hai ki ye number bhi bn skta hai judne ke baad
                    sumformed += expectedsum;
                }
            }
        }
        return patch;
    }
}