class Solution {
    // eazy peazy
    private int dfs(List<List<Integer>> list, int i, int j, Integer[][] dp) {
        if (i >= list.size() || j >= list.get(i).size())
            return Integer.MAX_VALUE;
        if (dp[i][j] != null)
            return dp[i][j];
        if (i == list.size() - 1)
            return dp[i][j] = list.get(i).get(j);
        int right = dfs(list, i + 1, j + 1, dp);
        int down = dfs(list, i + 1, j, dp);
        return dp[i][j] = list.get(i).get(j) + Math.min(right, down);
    }

    public int minimumTotal(List<List<Integer>> list) {
        Integer dp[][] = new Integer[list.size() + 1][list.get(list.size() - 1).size() + 1];
        return dfs(list, 0, 0, dp);
    }
}