class Solution {
    private int rev(int n){
        int ans =0;
        while(n>0){
            ans= (ans*10)+(n%10);
            n/=10;
        }
        return ans;
    }
    public int sumOfPrimesInRange(int n) {
        int ans =0;
        int m = rev(n);
        int min = Math.min(m,n);
        int max = Math.max(n,m);
        boolean arr [] = new boolean[max+1];
        // eratosthenes laga deta hu poore meh i.e. 0se
        // count sir min se kr lunga
        arr[0]=true;
        arr[1]=true;
        for(int i =2;i*i<=max;i++){
            for(int j =i*i;j<=max;j+=i){
                arr[j]=true;
            }
        }
        for(int i =min;i<=max;i++){
            if(!arr[i]) ans+=i;
        }

   return ans; }
}