class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        // 0dd depth ek taraf even depth ek taraf
        int ans []= new int[seq.length()];
        int maxdepth =0;
        int x=0;
        for(char a : seq.toCharArray()){
            if(a=='(') {
                 maxdepth++;
                ans[x++]=maxdepth%2==0?0:1;
               }
            else{ 
                ans[x++]=maxdepth%2==0?0:1;
                maxdepth--;}
        }

        return ans;
    }
}