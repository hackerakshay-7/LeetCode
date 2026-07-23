class Solution {
    private boolean isvalid(long mid , int[] arr , long k){
        long count =0;
        for(int a : arr){
           count+=a/mid;
           if(count>=k) return true; 
        }
        return false;
    }
    public int maximumCandies(int[] candies, long k) {
        // try nlogn
        long sum = 0;
        for(int a:candies) sum+=a;
        long e = sum/k;
        long s = 1;
        long ans=0;
        while(e>=s){
            long mid = s +(e-s)/2;
            if(isvalid(mid,candies,k)){
                ans=mid;
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }

 return (int)ans; }
}