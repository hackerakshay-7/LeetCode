class Solution {
    private int gcd(int a , int b ){
        if(a==0 || b==0) return 0;
      if(b%a==0) return a;
      b%=a;
     return gcd(b,a);
    }
    public long gcdSum(int[] nums) {
        int[] pregcd=new int[nums.length];
        int max = 0,i=0;
        long sum=0;
        for(int a : nums){
            max = Math.max(a,max);
            pregcd[i++]=gcd(max,a);
        }
        Arrays.sort(pregcd);
        int j =0,k=nums.length-1;
        while(j<k){
            sum+=(gcd(pregcd[j++],pregcd[k--]));
        }
    return sum;}
}