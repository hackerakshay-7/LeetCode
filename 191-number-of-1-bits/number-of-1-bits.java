class Solution {
    public int hammingWeight(int n) {
        // just for the sake of learning bitmanipulation
        // kisi bhi number ka & 000000--0001 se kroge toh last digit if 1 then 1
        // right shift krte jao
        int count =0;
        while(n>0){
            if((n&1)==1) count++;
           n= n>>1;
        }
   return count; }
}