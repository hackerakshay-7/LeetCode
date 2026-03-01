class Solution {
    public int minCost(int n) {
        // minimum cost hoga agar 1 + (n-1) meh batoge;
        return n*(n-1)/2;
    }
}