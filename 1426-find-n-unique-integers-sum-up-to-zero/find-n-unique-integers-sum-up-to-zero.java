class Solution {
    public int[] sumZero(int n) {
    int [] arr = new int[n];
    int j=n-1;
    int i =0;
    while(j>=i){
        if(i==j) arr[i]=0;
     else{ int randomfk = n--;
      arr[i]=randomfk;
      arr[j]=-randomfk;}
      j--;i++;
    }
   return arr; }
}