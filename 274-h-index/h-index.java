class Solution {
    public int hIndex(int[] citations) {
       int h = citations.length;
       Arrays.sort(citations);
       for(int i =0;i<h;i++){
       // if(citations[i]>h) continue;
      //  else if(citations[i]==0) return 1;
         if(citations[i]>=h-i) return h-i;
       }

    return 0;}
}