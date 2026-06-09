class Solution {
    public int minimumAddedCoins(int[] coins, int target) {
      // similar to 330
      Arrays.sort(coins);
      int count =0;
     long upto=0;
     long nextnum=0;
     int i=0;
     while(upto<target){
        if(upto>=nextnum) nextnum=upto+1;
        else{
            if(i<coins.length && coins[i]<=nextnum){
                upto+=coins[i];
                i++;
            }
            else{
                count++;
                upto+=nextnum;
            }
        }
     }
   return count; }
}