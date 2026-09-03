class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for(int base =2;base<=n-2;base++){
            int copy = n;
            int rev =0;
            while(copy>0){
                int temp=copy%base;
                rev = rev*base+temp; 
                // presume base 10 ->
                //0 * base + temp -> ex 123
                // 0*10 +1 then 1*10+2 then 12*10+3 = 123
                copy/=base;
            }
            if(rev!=n) return false;
        }
    return true;}
}