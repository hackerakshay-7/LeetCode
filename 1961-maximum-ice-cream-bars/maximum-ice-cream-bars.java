class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int total = 0;
        int count = 0;
        for (int a : costs) {
            total += a;
            if (total > coins)
                return count;
            count++;
        }
        return count;
    }
}