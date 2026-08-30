class Solution {
    public int minimumDeletions(int[] nums) {
        // could have used 3 scenarios anyways ->
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minidx = -1;
        int maxidx = -1;
        for(int i =0;i<n;i++){ 
            if(nums[i]>max){ maxidx = i; max = nums[i];}
            if(nums[i]<min){minidx = i ; min = nums[i];}
        }
        int p1 = Math.max(minidx+1,maxidx+1);
        int p2 = Math.max(n-minidx,n-maxidx);
        int p3 = minidx+1+n-maxidx;
        int p4 = maxidx+1+n-minidx;
      return Math.min(p1,Math.min(p2,Math.min(p3,p4)));

    }
}
/**
int minremoval = Math.min(minidx+1,n-minidx);
      int maxremoval = Math.min(maxidx+1,n-maxidx); */