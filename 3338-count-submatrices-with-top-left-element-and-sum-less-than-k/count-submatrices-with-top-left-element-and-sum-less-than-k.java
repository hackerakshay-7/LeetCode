class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int ans = 0;
        int arr[][] = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i == 0 && j == 0)
                    arr[i][j] = grid[0][0];
                else if (i == 0) {
                    arr[i][j] = arr[i][j - 1] + grid[i][j];
                } else if (j == 0) {
                    arr[i][j] = arr[i - 1][j] + grid[i][j];
                } else {
                    arr[i][j] = arr[i - 1][j] + arr[i][j - 1] + grid[i][j] - arr[i - 1][j - 1];
                }
                if(arr[i][j]<=k) ans++;
            }
        }
   return ans; }
}