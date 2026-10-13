class Solution {
    public long maxAlternatingSum(int[] nums) {
        long sum =0;
        int n = nums.length;
        long sums[]=new long[n];
        for(int i =0;i<n;i++){
            sums[i]=nums[i]*nums[i];
        }
        Arrays.sort(sums);
        if(n%2==0){
            int i =0;
            int j=n-1;
            while(i<j){
                sum+=sums[j]-sums[i];
                j--;
                i++;
            }
        }
        else{
            int i =0;
            int j =n-1;
            sum+=sums[j--];
            while(i<j){
                sum+=sums[j]-sums[i];
                j--;
                i++;
            }
        }
   return sum; }
}