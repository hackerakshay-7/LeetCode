class Solution {
    public int numTimesAllBlue(int[] flips) {
        // just check if complete permutation
        int count =0;
        int sum =0;
        int numcount =0;
        for(int i =0;i<flips.length;i++){
            numcount++;
            sum+=flips[i];
            if(sum==((float)(i+1)*(float)(i+2)/2) && numcount == i+1) count++;
        }
    return count;
       }
}