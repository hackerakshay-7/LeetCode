class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        // every trailing zero is made up of 5 X 2 
        // multiple of 2 occurs more frequently than multiple of 5
        // count total num. of multiple of 5 to get num of trailing zeros
        while(n>0){
            count+=n/5;
            n/=5;
        }
   return count; }
}