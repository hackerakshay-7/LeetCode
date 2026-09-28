class Solution {
    public int maxDepth(String s) {
        int incount=0,
            outcount=0,
            ans=0;
        for(char a : s.toCharArray()){
            if(a=='(') incount++;
            else if(a==')') outcount++;
            ans=Math.max(ans,incount-outcount);
        }
        
  return ans;  }
}