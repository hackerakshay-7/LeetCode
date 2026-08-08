class Solution {

    private boolean check(int [] arr , int mid){
        for(int i =2;i<arr.length;i++){
            if(arr[i]-arr[i-2]>mid) return false;

        }

        return true;
    }
    public int maxJump(int[] stones) {
        // i know the binary search is not required but thats what i started with
        // and i wanted to end with it
        int s = 0;
        int e = stones[stones.length-1];
        while(s<=e){
            int mid = s+(e-s)/2;
            if(stones[1]-stones[0]>mid){ s= mid+1;}
           else if(check(stones,mid)){ e = mid-1;}
            else{ s = mid+1;}

        }
   return s; }
}