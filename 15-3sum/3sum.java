class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int first = i + 1;
            int last = nums.length - 1;
            if(i>0 && nums[i]==nums[i-1]) continue;
            while (first < last) {
                int x = nums[first] + nums[i] + nums[last];
                if (x == 0) {
                    ans.add(Arrays.asList(nums[first], nums[last], nums[i]));
                    while (first < last && nums[first] == nums[first + 1]) {
                        first++;
                    }
                    while (first < last && nums[last] == nums[last - 1]) {
                        last--;
                    }
                    last--;
                    first++;
                } else if (x > 0) {
                    last--;
                } else {
                    first++;
                }
            }

        }
        return ans;
    }
}