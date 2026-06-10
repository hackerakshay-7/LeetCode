class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> (a[0] - b[0]));
        // sorting the priorityQ on the basis of sum
        // the int[] will be -> sum,i,j
        // the pair of i and j should not be repeated therefore use a hashset
        HashSet<String> set = new HashSet<>();
        pq.add(new int[] { nums1[0] + nums2[0], 0, 0 });
        set.add("0,0");
        while (!pq.isEmpty() && k-- > 0) {
            int[] min = pq.remove();
            int i = min[1];
            int j = min[2];
            ans.add(Arrays.asList(nums1[i], nums2[j]));
            if (i < nums1.length - 1 && !set.contains((i + 1) + "," + j)) {
                pq.add(new int[] { nums1[i + 1] + nums2[j], i + 1, j });
                set.add((i + 1) + "," + j);
            }
            if (j < nums2.length - 1 && !set.contains(i + "," + (j + 1))) {
                pq.add(new int[] { nums1[i] + nums2[j + 1], i, j + 1 });
                set.add((i) + "," + (j + 1));
            }

        }

        return ans;
    }
}