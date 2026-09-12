class Solution {
    class Pair {
        int[] idx;
        long score;

        Pair(int[] idx, long score) {
            this.idx = idx;
            this.score = score;
        }
    }

    private Pair dfs(int k, int i, int[][] arr, Pair dp[][]) {
        if (i == arr.length || k == 0)
            return new Pair(new int[0], 0);
        if (dp[i][k] != null)
            return dp[i][k];
        int s = i, e = arr.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid][0] > arr[i][1])
                e = mid - 1;
            else {
                s = mid + 1;
            }
        }
        Pair pick = dfs(k - 1, s, arr, dp);
        int newidx[] = new int[pick.idx.length + 1];
        newidx[0] = arr[i][3];
        for (int j = 0; j < newidx.length - 1; j++) {
            newidx[j + 1] = pick.idx[j];
        }
        long newscore = pick.score + arr[i][2];
        Pair notpick = dfs(k, i + 1, arr, dp);
        Arrays.sort(newidx);
        if (newscore > notpick.score) {
            return dp[i][k] = new Pair(newidx, newscore);
        } 
        else if(newscore<notpick.score) {
            return dp[i][k] = notpick;
        }
        else{
            // fkn scores are same hellshit
            if(Arrays.compare(newidx,notpick.idx)>0){
                return dp[i][k]= notpick;
            }
            else{
                return dp[i][k]=new Pair(newidx, newscore);
            }
        }

    }

    public int[] maximumWeight(List<List<Integer>> intervals) {
        int arr[][] = new int[intervals.size()][4];
        int i = 0;
        for (List<Integer> a : intervals) {
            arr[i][0] = a.get(0);
            arr[i][1] = a.get(1);
            arr[i][2] = a.get(2);
            arr[i][3] = i++;
        }
        //    intervals.sort(Comparator.comparing(row->row.get(0)));
        Pair dp[][] = new Pair[intervals.size()][5];
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        Pair ans = dfs(4, 0, arr, dp);

        return ans.idx;
    }
}

/**
Very classic Binary Search + 0-1 knapsack problem, the followings are the similar questions.
leetcode 1235
leetcode 2054
leetcode 1751
leetcode 2830
leetcode 2008 */