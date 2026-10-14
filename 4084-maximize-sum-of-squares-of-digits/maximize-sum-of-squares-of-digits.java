class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(sum>num*9) return "";
        StringBuilder sb = new StringBuilder();
       int a = sum/9;
       for(int i =0;i<a;i++){
        sb.append('9');
       }
       a = sum%9;
      if(a!=0) 
       sb.append(a);
       while(sb.length()<num){
         sb.append('0');
       }

   return sb.toString(); }
}