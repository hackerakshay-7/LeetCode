class Solution {
    public long maxSum(List<Integer> nums, int m, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        long sum = 0, ans = 0;
        for (int i = 0; i < k; i++) {
            map.put(nums.get(i), map.getOrDefault(nums.get(i), 0) + 1);
            sum += nums.get(i);
        }
        if (map.size() >= m && sum > ans)
            ans = sum;
        int i = k;
        int j = 0;
        while (i < nums.size()) {
            sum += nums.get(i);
            sum -= nums.get(j);
            map.put(nums.get(i), map.getOrDefault(nums.get(i), 0) + 1);
            map.put(nums.get(j), map.get(nums.get(j)) - 1);
            if (map.get(nums.get(j)) == 0)
                map.remove(nums.get(j));
            if (map.size() >= m && sum > ans)
                ans = sum;
            i++;
            j++;
        }

        return ans;
    }
}