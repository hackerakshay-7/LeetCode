class Solution {
    private long memo(int[][] rides, int i, Long[] dp) {
        // number of stops is not equal to avail idx
        // pick and not pick
        if (i >= rides.length)
            return 0;
        // if (n == 0)
        //     return rides[0][1] - rides[0][0] + rides[0][2];
        if (dp[i] != null)
            return dp[i];
        int low = i + 1, high = rides.length - 1;
        // binary
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (rides[mid][0] >= rides[i][1])
                high = mid - 1;
            else {
                low = mid + 1;
            }
        }
        // pick
        long pick = rides[i][1] - rides[i][0] + rides[i][2] + memo(rides, low, dp);

        long drop = memo(rides, i + 1, dp);

        return dp[i] = Math.max(pick, drop);

    }

    public long maxTaxiEarnings(int n, int[][] rides) {
        // i think i should memoize it i think i can
        // this question is like ninjas training, slightly different it is
        Long dp[] = new Long[rides.length + 1];
        Arrays.sort(rides, (a, b) -> Integer.compare(a[0], b[0]));
        return memo(rides, 0, dp);
    }
}