class Solution {
    public int candy(int[] ratings) {
        int [] left = new int[ratings.length];
        int [] right = new int [ratings.length];
        int sum =0;
        left[0]=1;
        right[ratings.length-1]=1;
        for(int i =0;i<ratings.length-1;i++){
            if(ratings[i+1]>ratings[i]){left[i+1]=left[i]+1;}
            else if(ratings[i]>=ratings[i+1]){ left[i+1]=1;}}
        for(int i =ratings.length-1;i>0;i--){
            if(ratings[i]<ratings[i-1]){right[i-1]=right[i]+1;}
            else if(ratings[i]>=ratings[i-1]){right[i-1]=1;}}
        for(int k=0;k<ratings.length;k++){
            sum+=Math.max(left[k],right[k]);
        }
   return sum; }
}