class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int m,n,o,p;
        int ans = dimensions[0][0]*dimensions[0][1];
        int ok =(int)Math.pow(dimensions[0][0],2);
        int ko = (int)Math.pow(dimensions[0][1],2);
        for(int i=0;i<dimensions.length-1;i++){
            m=(int)Math.pow(dimensions[i][0],2);
            n=(int)Math.pow(dimensions[i][1],2);
            o=(int)Math.pow(dimensions[i+1][0],2);
            p=(int)Math.pow(dimensions[i+1][1],2);
           
                if(m+n<o+p && o+p > ok+ko ){
                ans = dimensions[i+1][0]*dimensions[i+1][1];
                ok=(int)Math.pow(dimensions[i+1][0],2);
                ko=(int)Math.pow(dimensions[i+1][1],2);
                }
                else if(o+p == ko+ok){
ans = Math.max((int)(Math.sqrt(ok)*Math.sqrt(ko)),(int)(Math.sqrt(o)*Math.sqrt(p)));
if((int)(Math.sqrt(o)*Math.sqrt(p))>(int)(Math.sqrt(ok)*Math.sqrt(ko))){
     ok=(int)Math.pow(dimensions[i+1][0],2); 
      ko=(int)Math.pow(dimensions[i+1][1],2);
}}
 }
   return ans; }
}