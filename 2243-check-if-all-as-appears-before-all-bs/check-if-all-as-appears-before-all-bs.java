class Solution {
    public boolean checkString(String s) {
       int n=s.length();
     if(!s.contains("b")) return true;
        int b=s.lastIndexOf('a');
        int c=s.indexOf('b');
        if(b<c) return true;
   return false; }
}