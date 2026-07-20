class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length,n=grid[0].length;
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < grid.length; i++) {
            list.add(new ArrayList<>());
        }
        k%=m*n;
        int start = m*n-k;
        if(start==m*n) start =0;
        int row = start/n;
        int column = start%n;
        int ansrow = 0;
        boolean startb = false;
        for (int i = row; i <m; i++) {
            int j = 0;
            if (!startb)
                j = column;
            while (j < n) {
                list.get(ansrow).add(grid[i][j]);
                if (list.get(ansrow).size() == n)
                    ansrow++;
                    j++;
            }
            startb = true;

        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < n; j++) {
                list.get(ansrow).add(grid[i][j]);
                if (list.get(ansrow).size() == n)
                    ansrow++;
            }
        }
        if (column != 0) {
            for (int i = 0; i < column; i++) {
                list.get(ansrow).add(grid[row][i]);
            }
        }

        return list;
    }
}