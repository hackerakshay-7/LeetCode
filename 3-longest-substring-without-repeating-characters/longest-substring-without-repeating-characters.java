class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==1) return 1;
        if(s.length()==0) return 0;
        HashSet<Character> set = new HashSet<>();
        int i=0,j=0,ans=0;
        while(j<s.length()){
            if(set.contains(s.charAt(j))){set.remove(s.charAt(i));i++;}
           else{ set.add(s.charAt(j));  j++;}
            ans=Math.max(ans,set.size());
        }
    return ans;}
}