class Solution {
    public long sumAndMultiply(int n) {
        long sum =0;
        long x =0;
        long place =1;
        while(n>0){
            int a = n%10;
            sum+=a;
            if(a!=0){x+=(a*place);
            place*=10;}
            n/=10;
        }
      return sum*x; }
}