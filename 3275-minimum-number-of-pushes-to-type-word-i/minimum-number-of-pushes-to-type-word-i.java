class Solution {
    public int minimumPushes(String word) {
      int n = word.length();
      if(n<=8) return n;
      int ans =8;
      int a = n/8;
      int b = n%8;
      if(a==1 ){ans+=(b*2);}
      else if(a==2 ){ans+=(16); ans+=(3*b);}
      else if(a==3 ){ ans+=(40); ans+=(4*b);}
      

   return ans; }
}