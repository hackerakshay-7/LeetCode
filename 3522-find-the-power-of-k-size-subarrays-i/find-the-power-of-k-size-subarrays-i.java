class Solution {
    private int max(int[] nums, int s, int e) {
        for (int i = s; i < e; i++) {
            if ((nums[i]+1)!=nums[i + 1])
                return -1;
        }
        return nums[e];
    }

    public int[] resultsArray(int[] nums, int k) {
        int ans[] = new int[nums.length - k + 1];
        if (nums.length < k) {
            Arrays.fill(ans, -1);
            return ans;
        }
       int n =0;
        for (int i = 0; i < nums.length - k+1; i++) {
             int j =i+k-1;
             ans[n++] = max(nums, i, j);
        }
   return ans; }
}