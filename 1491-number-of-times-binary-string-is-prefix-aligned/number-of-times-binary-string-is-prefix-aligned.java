class Solution {
    public int numTimesAllBlue(int[] flips) {
        // i+1 ==changes
        int maxvis = 0;
        int count =0;
        for(int i =0;i<flips.length;i++){
            maxvis = Math.max(maxvis,flips[i]);
            if(i+1==maxvis) count++;
        }
    return count;}
}