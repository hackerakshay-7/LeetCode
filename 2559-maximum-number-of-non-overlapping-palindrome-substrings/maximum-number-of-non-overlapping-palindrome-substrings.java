class Solution {
    private boolean ispal(String s , int i , int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;j--;
        }
        return true;

    }
    // for solving optimally check only k sized and k+1 sized palindromic ss
    //bcoz jo bada palindrome hoga woh chota toh consist krega hi na
    // thats the greedy intution comment section helped
    public int maxPalindromes(String s, int k) {
        int last =-1;
        int n = s.length();
        int count =0;
       for(int i =0;i<n;i++){
        int win = i-k+1;
        if(win >last && ispal(s,win,i)){
            last = i ;
            count++;
            continue;
        }
        win = i-k;
        if(win > last && ispal(s,win,i)){
            count++;
            last=i;
        }
       }
   return count; }
}