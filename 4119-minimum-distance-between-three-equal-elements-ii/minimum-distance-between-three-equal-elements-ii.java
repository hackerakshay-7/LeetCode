class Solution {
    public int minimumDistance(int[] nums) {
        // number aur uske index ki list
        // j-i+k-j+k-i = 2*(k-i)
        int ans = Integer.MAX_VALUE;
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], new ArrayList<>());
                map.get(nums[i]).add(i);
            } else {
                map.get(nums[i]).add(i);
                if (map.get(nums[i]).size() == 3) {
                    ans = Math.min(ans, 2*(map.get(nums[i]).get(2) - map.get(nums[i]).get(0)));
                    map.get(nums[i]).remove(0);
                }
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}