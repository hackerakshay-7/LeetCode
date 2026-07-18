class Solution {
    public int maximumLength(int[] nums) {
        // original id se aao lcs
        Map<Long, Integer> map = new HashMap<>();
        int max = 0;
        for (long a : nums) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        if (map.containsKey(1l)) {
            max = Math.max(max, map.get(1l) % 2 == 0 ? map.get(1l) - 1 : map.get(1l));
        }
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            if (nums[i] == 1)
                continue;
            long a = nums[i];
            while (a < 1000_000_000 && map.getOrDefault(a, 0) >= 2) {
                count += 2;
                a *= a;
            }
            // here comes the thing
            if (a < 1000_000_000 && map.getOrDefault(a, 0) > 0) {
                count++; // the last odd element is here 
            } else {
                count--;
            } // if there aint any last single element we can still form a sequence ex -> 2,2,4,4 (16 aint present) : len(4) - 1 can do the thingi 2,4,2 that is
            max = Math.max(count, max);
        }
        return max;
    }
}