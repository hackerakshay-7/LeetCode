class Solution {
    private int calculate(int[][] a, int[][] b, int s, int t) {
        int count = 0;
        int k = Math.max(0, s);
        int start = Math.max(0, -s);
        for (int i = start; i < a.length && k < b.length; i++) {
            int l = Math.max(0, t);
            int startJ = Math.max(0, -t);
            for (int j = startJ; j < a[0].length && l < b[0].length; j++) {
                if (a[i][j] == 1 && b[k][l] == 1)
                    count++;
                l++;
            }

            k++;
        }

        return count;
    }

    public int largestOverlap(int[][] a, int[][] b) {
        int m = a.length, n = a[0].length;
        int score = 0;
        for (int i = -(m - 1); i < m; i++) {
            for (int j = -(n - 1); j < n; j++) {
                score = Math.max(score, calculate(a, b, i, j));
            }
        }

        return score;
    }
}