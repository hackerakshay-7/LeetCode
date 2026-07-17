class Solution {
    public int maxScore(int[] nums) {
     // sabse bada +ve num then chote chote -ve num
     // zeores are very useful should i have a count of zero to maximize the sum
     Arrays.sort(nums);
     int i =nums.length-1;
     int count =0;
     long sum=0;
     while(i>=0){
        if(nums[i]<0) break;
        sum+=nums[i--];
        if(sum>0)count++;
     }
     while(i>=0 && sum>0){
        if(sum+nums[i]<=0) break;
        sum+=nums[i--];
         count++;
     }

    return count;}
}

/**
 int i =0;
     while(nums[i]<0){
        i++;
     }
     int prefixsum=0,count=0;
     for(int j =nums.length-1;j>=0;j--){
        if(nums[j]<=0) break;
        prefixsum+=nums[j];
        while(i>=0){
            if(prefixsum+nums[i]<=0) {break;}
            prefixsum+=nums[i--];
        }
     }
   return sum;  */