class Solution {
    public int trap(int[] height) {
        // azzzzzzzzhoLLE; 
        int ans=0;
        int [] leftmax=new int [height.length];
        int [] rightmax = new int [height.length];
        int max=0,ma=0;
     for(int i=0,j=height.length-1;i<height.length;i++,j--){
        leftmax[i]=max;max=Math.max(max,height[i]);
        rightmax[j]=ma;ma=Math.max(ma,height[j]);}
        for(int i=0;i<height.length;i++){
            int m = Math.min(leftmax[i],rightmax[i])-height[i];
            if(m>=0){ ans+=m;}
           
        }

    return ans;}
}