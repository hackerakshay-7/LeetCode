class Solution {
    private void dfs(List<List<Integer>> ans, int k, int n, List<Integer> curr, int a) {
        if (curr.size() == k) {
            ans.add(new ArrayList<>(curr));
            // curr.remove(curr.size()-1); 
            return;
        }
        for (int i = a; i <= n; i++) {
            curr.add(i);
            dfs(ans, k, n, curr, i + 1);
            if (curr.size() > 0)
                curr.remove(curr.size() - 1);
        }

    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(ans, k, n, new ArrayList<>(), 1);
        return ans;
    }
}