class Solution {
     private int two(int n){
        int steps=0;
        while(n>1){
            n/=2;
            steps++;
        }
        return steps;
    }
    private int bit(int n){
        int a =1;
        int count =0;
        while(a<=n){
            if((a&n)==a) count++;
           a= a<<1;
        }
        return count;
    }
    public int minOperations(int[] nums) {
      int max = Integer.MIN_VALUE;
      int ans =0;
      for(int a : nums){
        ans+=(bit(a));
        max = Math.max(a,max);
      }
      return ans+two(max);
    }
}
/**
   // increments alag se count krta hu
        // doubling toh max element jitna hi hoga
        int max = Integer.MIN_VALUE;
        int odd =0;
        int zero =0;
        int one =0;
        for(int a : nums){
            max = Math.max(max,a);
            if(a==0) zero++;
            if(a%2==1) odd++;
            if(a==1) one++;
        }
        return (max/2)+(odd*2)-zero+nums.length-odd-one; */