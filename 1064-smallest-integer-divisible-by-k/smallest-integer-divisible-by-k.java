class Solution {
    public int smallestRepunitDivByK(int k) {
        // k goes to like 100000
       if(k%2==0 || k%5==0 ) return -1;
       int mod =1%k;
       // let us presume all reminders upto the length of k are different which is impossible bcoz for len 1 mod = 1 (presume) for 2 mod =2 ------------
       // --------- for len(k) mod = k-1; by piegon hole or some bullshit they are very sure of it 
       for(int i =1;i<=k;i++){
            if(mod==0) return i;
            mod = (mod*10+1)%k;
       }
  return -1;  }
}