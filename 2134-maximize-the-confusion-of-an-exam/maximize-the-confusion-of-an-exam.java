class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        // int tcount = 0;
        // int fcount =0;
        int n = answerKey.length();
        if(k==n) return n;
       int max = maxfind(answerKey,k,'T');
       max = Math.max(max,maxfind(answerKey,k,'F'));

       return max;
    }
    private int maxfind(String s , int k , char c){
        int count =0;
        int max =0;
        int j =0;
        for(int i =0;i<s.length();i++){
            char a = s.charAt(i);
            if(a!=c) count++;
            while(count>k){
                // shrink shit
                if(s.charAt(j)!=c) count--;
                j++;

            }
            max = Math.max(max , i-j+1);
        }
        return max;
    }
}