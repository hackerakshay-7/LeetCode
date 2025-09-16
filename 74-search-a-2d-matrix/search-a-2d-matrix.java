class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length-1;
        int n = matrix[m].length-1;
        int i=0;
    while(i<m&&matrix[i][n]<target){
        i++;}
        int f=0;
        int l=n;
        while(f<=l){
            int mid= f+(l-f)/2;
            if(matrix[i][mid]==target) return true;
            else if(matrix[i][mid]>target){ l=mid-1;}
            else{f=mid+1;}
        }
   return false; }
}