class Solution {
    public boolean checkDivisibility(int n) {
        // the sum will be less than n 
        // product will also 
        // 
        int sum = 0;
        int prod=1;
        int copy =n;
        while(n>0){
            int a = n%10;
            sum+=a;
            prod*= a;
            n/=10;
        }
        return copy%(sum+prod)==0;
    }
}