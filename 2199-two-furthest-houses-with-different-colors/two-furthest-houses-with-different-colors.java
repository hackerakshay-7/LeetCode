class Solution {
    public int maxDistance(int[] colors) {
        int n=colors.length;
       int distance = Integer.MIN_VALUE;
       for(int i =0;i<n;i++){
        if(colors[n-1]!=colors[i]){
            distance = n-1-i;
            break;
        }
       }
       for(int i = n-1;i>=0;i--){
        if(colors[0]!=colors[i]) distance = Math.max(distance,i);
       }
        
   return distance; }
}