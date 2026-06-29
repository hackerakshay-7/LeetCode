class Solution {
    public int countDistinct(int[] nums, int k, int p) {
        HashSet<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            int div_count = 0;
            int j = i;
            while (div_count <= k && j < nums.length) {
                if (nums[j] % p == 0)
                    div_count++;
                if (div_count <= k) {
                    list.add(nums[j]);
                }
                j++;
                set.add(new ArrayList<>(list));
            }

        }
        return set.size();
    }
}