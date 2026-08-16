class Solution {
    private boolean dfs(boolean[][] isv, int a, int b, int target, int x, int y) {
        if (a > x || b > y || a < 0 || b < 0)
            return false;
        if (a + b == target)
            return true;
        if (isv[a][b])
            return false;
        isv[a][b] = true;
        boolean one = dfs(isv, a + x, b, target, x, y); // fill x jug complete
        boolean two = dfs(isv, a, b + y, target, x, y); // fill y complete 
        boolean three = dfs(isv, 0, b, target, x, y); // empty x completely
        boolean four = dfs(isv, a, 0, target, x, y); // empty y completely
        int pour = Math.min(a, y - b);
        // a is avail water in x jug y-b gives empty space in which water can be poured  so at most we can put pour water in jug2
        boolean five = dfs(isv, a - pour, b + pour, target, x, y);
        int pour2 = Math.min(x - a, b);
        boolean six = dfs(isv, a + pour2, b - pour2, target, x, y);
        if (one)
            return true;
        if (two)
            return true;
        if (three)
            return true;
        if (four)
            return true;
        if (five)
            return true;
        if (six)
            return true;
        return false;
    }

    public boolean canMeasureWater(int x, int y, int target) {
        if (target > x + y)
            return false;
        boolean[][] isv = new boolean[x + 1][y + 1];
        return dfs(isv, 0, 0, target, x, y);
    }
}