class Solution {
    public int reverseDegree(String s) {
        int ans =0;
        int i=1;
        for(char a : s.toCharArray()){
            // 'z'-a+1
            ans+=(i++*Math.abs(a-122-1));
        }
   return Math.abs(ans); }
}