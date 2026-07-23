class Solution {
    public int uniqueXorTriplets(int[] nums) {
        // gpt se kiya hai devanshu bhai -_-
        // x^x^x = x
        // x^x^y = y
        // every number is obtainable as said by gpt bhai (upto n ka bitlength ka max int ex if n.bitlength== 4 then )
        //
        int n = nums.length;
        if(n<3) return n;
        int ans =1;
        while(ans<=n) ans<<=1;
        return ans;
    }
}