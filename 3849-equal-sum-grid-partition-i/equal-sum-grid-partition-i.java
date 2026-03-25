class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        long row[] = new long[grid.length];
        long col[] = new long[grid[0].length];
        for (int i =0;i<grid.length;i++) {
            long sum = 0;
            for (int j=0;j<grid[0].length;j++) {
                sum += grid[i][j];
            }
            row[i] = sum;
        }
        for (int i = 0; i < grid[0].length; i++) {
            long sum = 0;
            for (int j = 0; j < grid.length; j++) {
                sum += grid[j][i];
            }
            col[i] = sum;
        }
        long totalrow = 0;
        long totalcol = 0;
        for (long a : row) {
            totalrow += a;
        }
        for (long a : col) {
            totalcol += a;
        }
        long findrow = totalrow / 2;
        if (totalrow % 2 == 0) {
            long sum = 0;
            for (long a : row) {
                sum += a;
                if (sum == findrow)
                    return true;
                else if (sum > findrow)
                    break;
            }
        }
        long findcol = totalcol/2;
        if(totalcol%2==0){
            long sum =0;
            for(long a : col){
                sum += a;
                if (sum == findrow)
                    return true;
                else if (sum > findrow)
                    break;
            }
        }

        return false;
    }
}