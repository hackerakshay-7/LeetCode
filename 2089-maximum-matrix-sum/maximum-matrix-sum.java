class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum =0,min=100001,c=0;
        for(int [] a : matrix){
            for(int b : a){
                if(b<0) {c++; b=-b;}
                sum += b;
                min=Math.min(Math.abs(b),min);
            }}
            
            return c%2==0 ? sum:sum-(2*min);
    }
}