class Solution {
    public int trailingZeroes(int n) {
        // every trailing zero is made up of 5 X 2 
        // multiple of 2 occurs more frequently than multiple of 5
        // count total num. of multiple of 5 to get num of trailing zeros
      return (n/15625 + n/3125 + n/625 + n/125 + n/25 + n/5); }
}