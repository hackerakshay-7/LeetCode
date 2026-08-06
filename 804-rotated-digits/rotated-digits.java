class Solution {
    private boolean check(int a){
       boolean avail = false;
        while (a> 0) {
            int digit = a % 10;
            if (digit == 3 || digit == 4 || digit == 7) return false;
            if (digit == 2 || digit == 5 || digit == 6 || digit == 9) {
                avail = true;
            }
            a /= 10;
        }
        return avail;
    }
    public int rotatedDigits(int n) {
        // exclude the numbers having 3 -4 -7
        // 1 - 8 -0 -> can be there they dont make any difference
        // observe for 1 to 10 -> 4 only 2 , 5 , 6, 9 
        // 20 -.> 12 , 15 , 16 ,19,20
        // 30 ->  21, 22, 25,26,28,29
        // 40 ->ek bhi 3x wala nhi 
        // 50 -> 50
        // lets brute force
        int count =0;
        for(int i =2;i<=n;i++){
            if(check(i)) count++;
        }
   return count; }
}