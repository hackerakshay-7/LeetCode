class Solution {
    public int rearrangeCharacters(String s, String target) {
        int ans=0;
        int [] arr= new int[26];
        int [] arr2 =new int[26];
        for(int i=0;i<target.length();i++){
           arr[target.charAt(i)-97]++;}
        for(int i=0;i<s.length();i++){
            arr2[s.charAt(i)-97]++;}
           while(true){ for(int i =0; i<26;i++){
            if(arr2[i]<arr[i] && arr[i]!=0) return ans;
           arr2[i]= arr2[i]-arr[i];
           }ans++;}
    }
}