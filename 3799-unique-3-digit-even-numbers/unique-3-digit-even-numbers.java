class Solution {
    private void permute (int[] arr, HashSet<Integer> set, int temp, boolean [] isv) {
        if (temp > 99) {
            if (temp % 2 == 0)
                set.add(temp);
            return;
        }
        for (int j = 0; j < arr.length; j++) {
            if ((temp == 0 && arr[j] == 0 )|| isv[j])
                continue;
                isv[j]=true;
            permute( arr, set, (temp * 10) + arr[j],isv);
            isv[j]=false;
        }
    }

    public int totalNumbers(int[] digits) {
        // int even = 0;
        // int n = digits.length;
        // for (int a : digits) {
        //     if (a % 2 == 0)
        //         even++;
        // }
        // if (even == 0)
        //     return 0;
        HashSet<Integer> set = new HashSet<>();
        boolean isv[] = new boolean[digits.length];
        // saare permutations banata hu aur even waalo ko set meh daal detahu
        permute(digits, set, 0 ,isv);
        return set.size();
    }
}