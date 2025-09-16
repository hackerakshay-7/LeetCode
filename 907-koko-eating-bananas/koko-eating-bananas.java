class Solution {
  
   static boolean isvalid(int m,int[]arr,long h){
        long totalh=0;
        for(int i=0;i<arr.length;i++){
            totalh +=arr[i]/m;
            if(arr[i]%m!=0){totalh+=1;}
        }  
        return totalh<=h;
    }
     public int minEatingSpeed(int[] piles, int h) {
        int ans=-1;
       int l = 0;
       for(int i=0;i<piles.length;i++){
        l = Math.max(piles[i] , l );
       }
       int f=1;
       int mid;
       while(f<=l){
        mid=f+(l-f)/2;
        if(isvalid(mid,piles,h)){
                ans=mid;
                l=mid-1;
        }
        else{
             f=mid+1;
             }
        }
       
  return ans; 
   
} 
}