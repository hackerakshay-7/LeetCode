class Solution {
    public int maxProduct(int n) {
        // waise toh nine hi case bante hai
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        while(n>0){
            if(max<n%10) {
                smax=max;
                max = n%10;}
            else if(smax<n%10) smax=n%10;
            n/=10;
        }
        return smax*max;
    }
}