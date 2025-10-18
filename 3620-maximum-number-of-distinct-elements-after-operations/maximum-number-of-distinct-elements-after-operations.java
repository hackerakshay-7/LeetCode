class Solution {

    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);
        int c = 0;
        int prev = Integer.MIN_VALUE;
        for (int num : nums) {
            int co = Math.min(Math.max(num - k, prev + 1), num + k);
            if (co > prev) {
                c++;
                prev = co;
            }
        }
        return c;
    }
}