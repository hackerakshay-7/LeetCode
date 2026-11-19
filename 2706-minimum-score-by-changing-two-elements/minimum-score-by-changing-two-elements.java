class Solution {
    public int minimizeSum(int[] nums) {
         int n = nums.length;
        if (n < 4)
            return 0;

        Arrays.sort(nums);
        int ans = Integer.MAX_VALUE;

        // min and 2nd min change
        ans = Math.min(ans,(nums[n-1]-nums[2]));
        // largest ans smallest
        ans = Math.min(ans,(nums[n-2]-nums[1]));
        // fk off largest and 2nd largest
        ans = Math.min(ans,(nums[n-3]-nums[0]));

        return ans;
    }
}

/**
 // min diff ko zero banau 
    // 2nd min aur max element ke median meh convert krdo smallest ko
    private static class Pair {
    int idx;
    int val;
    Pair(int idx, int val) { this.idx = idx; this.val = val; }
}
    private Pair[] min(int[] arr) {
        Pair ans[] = new Pair[3];
        Pair min = new Pair(0,Integer.MAX_VALUE);
        Pair smin =  new Pair(0,Integer.MAX_VALUE);
        Pair max = new Pair(0,Integer.MIN_VALUE);
        for (int i=0;i<arr.length;i++) {
            int a = arr[i];
            if (a < min.val) {
                min.idx=i;
                smin.val=min.val;
                  min.val = a;
            } else if (a < smin.val) {
                smin.idx=i;
                smin.val = a;
            }
            if(a>max.val){
                max.val =a;
                max.idx=i; 
            }
        }
        ans[0] = min;
        ans[1] = smin;
        ans[2] = max;

        return ans;
    }

    public int minimizeSum(int[] nums) {
        int n = nums.length;
        if (n <= 4)
            return 0;
        Pair[] temp = min(nums);

       Pair min = temp[0];
       Pair smin = temp[1];
       Pair max = temp[2];
       // first change
       nums[min.idx]=(max.val+smin.val)/2;
       temp = min(nums);

         min = temp[0];
        smin = temp[1];
        max = temp[2];
       // 2nd change
       nums[min.idx]=(max.val+smin.val)/2;

        int mindiff =0,maxdiff=0;
        Arrays.sort(nums);
        for(int i =1;i<n;i++){
            mindiff=Math.min(mindiff,nums[i]-nums[i-1]);
        }
        maxdiff=nums[n-1]-nums[0];
        return mindiff+maxdiff;


    }
 */