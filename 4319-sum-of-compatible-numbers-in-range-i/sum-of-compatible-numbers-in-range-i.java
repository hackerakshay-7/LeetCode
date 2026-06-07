class Solution {
    public int sumOfGoodIntegers(int n, int k) {
        int count =0;
     for(int i =1;k>=Math.abs(i-n) || i<n;i++){
        if((i&n)==0 && Math.abs(i-n)<=k) count+=i;
     }   
   return count; }
}