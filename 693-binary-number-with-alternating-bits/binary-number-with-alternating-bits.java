class Solution {
    public boolean hasAlternatingBits(int n) {
      String ans = Integer.toBinaryString(n);
      int i=0;
      while(i<ans.length()-1){
        if(ans.charAt(i)==ans.charAt(i+1)) return false;
        i++;
      }
   return true; }
}