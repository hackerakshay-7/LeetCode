class Solution {
    // evencount/oddcount <= a/b
        // evencount< = a
        // oddcount <=b
    public int countRatioSubarrays(int[] nums, int a, int b) {
        int count =0;
     for(int i =0;i< nums.length;i++){
      int oddcount =0;
      int evencount =0;
        for(int j = i;j<nums.length;j++){
            if(nums[j]%2==0) evencount++;
          else{ oddcount++;}
          if(oddcount >0 && evencount*b<=oddcount*a) count++;
        }
     }
    return count;}
}