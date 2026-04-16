class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < queries.length; i++) {
            ArrayList<Integer> temp = map.get(nums[queries[i]]);
            if (temp.size() < 2) {
                ans.add(-1);
            } else {
                int index = queries[i];
                int min = Integer.MAX_VALUE;
                int pos = Collections.binarySearch(temp,index);
                int left = (pos - 1 + temp.size()) % temp.size();
                int leftIndex = temp.get(left);
                int diffLeft = Math.abs(leftIndex - index);
                int distLeft = Math.min(diffLeft, nums.length - diffLeft);
                min = Math.min(min, distLeft);
                int right = (pos + 1) % temp.size();
                int rightIndex = temp.get(right);
                int diffRight = Math.abs(rightIndex - index);
                int distRight = Math.min(diffRight, nums.length - diffRight);
                min = Math.min(min, distRight);
                ans.add(min);

            }
        }

        return ans;
    }
}