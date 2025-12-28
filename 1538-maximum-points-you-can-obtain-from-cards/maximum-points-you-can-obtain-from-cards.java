class Solution {
    public int maxScore(int[] cardPoints, int k) {
       int sum =0,comp=0;
       for(int i =0;i<k;i++){
        sum+=cardPoints[i];}
        comp=sum;
        for(int i = cardPoints.length-1;k!=0;k--,i--){
            sum=sum+cardPoints[i]-cardPoints[k-1];
            comp=Math.max(comp,sum);
        }

  return comp;  }
}



/* 
 int sum=0,comp=Integer.MIN_VALUE;
        for(int i =0;i<k;i++){
            sum+=cardPoints[i]; }
            comp=Math.max(comp,sum);
            sum=0;
            for(int i = cardPoints.length-1;k!=0;i--,k--){
                sum+=cardPoints[i];
            } 
            return Math.max(comp,sum); */