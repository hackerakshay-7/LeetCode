class Solution {
    public int countPrimes(int n) {
        // seive of eratosthenes by adarsh gupta
        int[]arr = new int[n+1]; 
        int count =0;
        Arrays.fill(arr,1);
        for(int i =2;i<=n/i;i++){
           if(arr[i]==1){ for(int j = i*i;j<n;j+=i){
                if(j%i==0) arr[j]=0;
            }}
        }
        for(int i =2;i<n;i++){
            if(arr[i]==1) count++;
        }
   return count; }
}