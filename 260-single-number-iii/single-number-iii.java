class Solution {
    // creating groups without physically creating groups 
    // GOOD QUESTION
    public int[] singleNumber(int[] nums) {
        // if i xor all then the result will be xor of the answers
        int xor =0;
        for(int a : nums) xor^=a;
        int firstset = 1;
        int copy = xor;
        // partition the array into two on the basis of the first set bit of all the nums xor 
        // bcoz the two answers fs will have different bit there

        while((firstset&xor)==0){
            // finding first set bit
           firstset= firstset<<1;
        }
        for(int a : nums){
            if((a&firstset)!=0){
                xor^=a;
            }
        }

    return new int[]{xor,copy^xor};}
}