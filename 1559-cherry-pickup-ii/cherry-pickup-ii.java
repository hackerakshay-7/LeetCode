class Solution {
    Integer dp[][][];

    public int cherryPickup(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        dp = new Integer[m][n][n];
        return foff(grid, 0, 0, n - 1);
    }

    private int foff(int[][] grid, int i, int j1, int j2) {
        int m = grid.length, n = grid[0].length;
        if (i >= m || j1 >= n || j2 >= n || i < 0 || j1 < 0 || j2 < 0)
            return -1;
        if (i == m - 1) {
            if (j1 == j2)
                return grid[i][j1];
            else {
                return grid[i][j1] + grid[i][j2];
            }
        }
        if (dp[i][j1][j2] != null)
            return dp[i][j1][j2];

        int one = foff(grid, i + 1, j1 + 1, j2);
        int two = foff(grid, i + 1, j1 + 1, j2 - 1);
        int three = foff(grid, i + 1, j1 + 1, j2 + 1);

        int four = foff(grid, i + 1, j1 - 1, j2);
        int five = foff(grid, i + 1, j1 - 1, j2 - 1);
        int six = foff(grid, i + 1, j1 - 1, j2 + 1);

        int seven = foff(grid, i + 1, j1, j2);
        int eight = foff(grid, i + 1, j1, j2 - 1);
        int nine = foff(grid, i + 1, j1, j2 + 1);
        int add = 0;
        if (j1 == j2)
            add = grid[i][j1];
        else {
            add = grid[i][j1] + grid[i][j2];
        }
        return dp[i][j1][j2] = add + Math.max(one, Math.max(two, Math.max(three,
                Math.max(four, Math.max(five, Math.max(six, Math.max(seven, Math.max(eight, nine))))))));

    }
}