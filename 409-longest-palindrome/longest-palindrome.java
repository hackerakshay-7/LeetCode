class Solution {
    public int longestPalindrome(String s) {
        int arr[] = new int[128];
        for(char c : s.toCharArray()) arr[c]++;
        int sum=0; boolean t = true;
        for(int a : arr){
            if(a%2==0) sum+=a;
            else if ( a%2!=0 && t){ sum+=a; t =false;}
            else{ sum+=a-1;}
        }
   return sum; }
}