class Solution {
    public void rotate(int[][] matrix) {
        // first take transpose then reverse the row Quite Simple Is It?
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = i + 1; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            int s = 0, e = matrix.length - 1;
            while (s < e) {
                int temp = matrix[i][s];
                matrix[i][s] = matrix[i][e];
                matrix[i][e] = temp;
                s++;
                e--;
            }
        }

    }
}