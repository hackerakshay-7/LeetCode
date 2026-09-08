class Solution {
    private void foff(ArrayList<Integer> ans, int n, int k, StringBuilder temp, int work) {
        temp.append(work);
        if (temp.length() == n) {
            ans.add(Integer.parseInt(temp.toString()));
             temp.deleteCharAt(temp.length() - 1);
            return;
        }
        // three cases ->
        //yah toh append work
        // yah fir append work +k
        // yah fir append work -k
        if (work + k <= 9) {
            foff(ans, n, k, temp, work + k);
        }
        if (work - k >= 0 && k!=0) {
            foff(ans, n, k, temp, work - k);
        }
         temp.deleteCharAt(temp.length() - 1);
    }

    public int[] numsSameConsecDiff(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            foff(list, n, k, new StringBuilder(""), i);
        }
        int ans[] = new int[list.size()];
        int i = 0;
        for (int a : list)
            ans[i++] = a;
        return ans;
    }
}
/**
 if (add)
            temp.append(work);
        else if (work + k < 10) {
            temp.append(work + k);
        } else if (work + k >= 10) {
            if (work - k >= 0) {
                temp.append(work - k);
            } else {
                return;
            }
        }
        foff(ans, n, k, temp, work, !add); */