class Solution {
    // 1 - 4 - 9  prefix sum
    // 1 , 13 , 135 , 3, 35 , 5 
    private static final int Mod = 1000_000_007;
    public int numOfSubarrays(int[] arr) {
        int n = arr.length;
        int even =0;
        int odd =0;
        int sum =0;
        int count=0;
        for(int a : arr){
            sum= (sum+a)%Mod;
            if(sum%2==0){
                // even + odd = odd
                // even subarray doesnt contribute but if we remove an odd subarray from it then
                // we get a new odd subarray 
                // i.e previous number of odd subarrays is the new numbers of new odd subarrays
                even++;
                count= (count+odd)%Mod;
            }
            else{
                odd++;
                count= (count+even+1)%Mod;
            }
        }
    return count;}
}