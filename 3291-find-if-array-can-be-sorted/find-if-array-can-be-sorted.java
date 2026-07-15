class Solution {
    // private void swap(int i, int[] arr) {
    //     int temp = arr[i];
    //     arr[i] = arr[i + 1];
    //     arr[i + 1] = temp;
    // }

    public boolean canSortArray(int[] nums) {
        // lets brute it cuz constraints are small
        // 0(n) for bit count and for every n num -> complexity = bitlen*0(n)
        // set meh store kiya jaaye cuz even if no repeats the set bit will be same
        // let j>i -> if(arr[j]<arr[i] && set bit) swap if not break cuz adjacent
        // at last use a for loop to check validity 
        // and we are GTG
        int bits[] = new int[nums.length];
        for(int i =0;i<nums.length;i++){
                int count =0,copy = nums[i];
                while(copy>0){ if((copy & 1)==1) count++; copy = copy>>1;}
                bits[i]=count;
            }
            for(int i =0;i<nums.length;){
                int j =i;
                while(j<bits.length && bits[j]==bits[i]){j++;}
                Arrays.sort(nums,i,j);
                i=j;
            }
    for(int i = 0;i<nums.length-1;i++) {
        if (nums[i] > nums[i + 1])
            return false;
    }
    return true;
}}