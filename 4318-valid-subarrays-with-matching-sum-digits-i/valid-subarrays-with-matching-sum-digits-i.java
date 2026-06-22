class Solution {

    private boolean check(long temp, int x) {
        if (temp % 10 != x) {
            return false;
        }

        while (temp >= 10) {
            temp /= 10;
        }

        return temp == x;
    }

    public int countValidSubarrays(int[] nums, int x) {
        int ans = 0;
        HashSet<Long> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            long temp = 0;
            for (int j = i; j < nums.length; j++) {
                temp += nums[j];
                if (!set.contains(temp) && check(temp, x))
                    ans++;
            }
        }
        return ans;
    }
}