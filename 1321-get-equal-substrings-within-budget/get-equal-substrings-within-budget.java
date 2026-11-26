class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int ans =0;
        int n = s.length();
        int diff =0;
        int j =0;
        for(int i =0;i<n;i++){
            diff+=(Math.abs(s.charAt(i)-t.charAt(i)));
            while(diff > maxCost){
                // shrink
                diff-=(Math.abs(s.charAt(j)-t.charAt(j)));
                j++;
            }
            ans = Math.max(ans,i-j+1);
        }
   return ans; }
}