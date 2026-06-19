class Solution {
    // still dont get this my approach is on brave
    public int maxAbsValExpr(int[] arr1, int[] arr2) {
        // i tried many ways by myself
        // brute force gave tle
        // now asked to gpt 
        // there may be 2^3 = 8 sign possibilites but there will be only four kyuki remaining four will be just same but of opposite sign
        // it said let a fun be F = arr1[x]+arr2[x]+x
        // ans = F(i) - F(j);
        // replace x by i and j 
        int ans =0;
        int max1 = Integer.MIN_VALUE, min1 = Integer.MAX_VALUE;
        int max2 = Integer.MIN_VALUE, min2 = Integer.MAX_VALUE;
        int max3 = Integer.MIN_VALUE, min3 = Integer.MAX_VALUE;
        int max4 = Integer.MIN_VALUE, min4 = Integer.MAX_VALUE;

        for (int i = 0; i < arr1.length; i++) {

            int f1 = arr1[i] + arr2[i] + i;
            int f2 = arr1[i] + arr2[i] - i;
            int f3 = arr1[i] - arr2[i] + i;
            int f4 = arr1[i] - arr2[i] - i;

            max1 = Math.max(max1, f1);
            min1 = Math.min(min1, f1);

            max2 = Math.max(max2, f2);
            min2 = Math.min(min2, f2);

            max3 = Math.max(max3, f3);
            min3 = Math.min(min3, f3);

            max4 = Math.max(max4, f4);
            min4 = Math.min(min4, f4);
        }

        ans = Math.max(ans, max1 - min1);
        ans = Math.max(ans, max2 - min2);
        ans = Math.max(ans, max3 - min3);
        ans = Math.max(ans, max4 - min4);

        return ans;

    }
}