class Solution {
    public int concatenatedBinary(int n) {
        int mod = 1000000007;
        int shift = 0;
        long ans = 0;
        for (int i = 1; i <= n; i++) {
            if ((i & (i - 1)) == 0) {
                shift++;
            }
            ans = ((ans << shift) % mod + i) % mod;
        }

        return (int)ans;
    }
}