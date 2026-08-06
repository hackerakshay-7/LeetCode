class Solution {
    private int split(int n){
        int ret = 1;
        while(n>0){
            ret*= n%10;
            n/=10;
        }
        return ret;
    }
    public int smallestNumber(int n, int t) {
        for(int i =n;i<n+10;i++){
            if( split(i)%t==0) return i;
        }
    return n;}
}