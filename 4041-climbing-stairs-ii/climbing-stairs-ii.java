class Solution {
    Integer dp[];
    private int dfs(int n, int[] costs) {
        if (n == 0)
            return 0;
        if (n < 0)
            return Integer.MAX_VALUE / 2;
        if (dp[n - 1] != null)
            return dp[n - 1];

        int one = dfs(n - 1, costs) + (1);
        int two = dfs(n - 2, costs) + 4;
        int three = dfs(n - 3, costs) + 9;

        return dp[n - 1] = Math.min(one, Math.min(two, three)) + costs[n - 1];

    }

    public int climbStairs(int n, int[] costs) {
        dp = new Integer[n];
        return dfs(n, costs);
    }
}