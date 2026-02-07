class Solution {
    public int minimumDeletions(String s) {
        int b =0;
        int deletion=0;
        for(char a:s.toCharArray()){
            if(a=='b'){ b++;}
            else{
                deletion = Math.min(deletion+1,b);
            }
        }
   return deletion; }
}