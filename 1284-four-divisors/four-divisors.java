class Solution {
    public int sumFourDivisors(int[] nums) {
        int arr [] = new int[4];
        arr[0]=1;
        int c=1,ans=0;
        for(int a : nums){
            for(int i =2;i<=a;i++){
                if (c==4) break;
                if(a%i==0){arr[c]=i; c++;}
            }
            c=1;
            if(arr[3]==a){ for(int b: arr){ans+=b;}}
        }
   return ans; }
}