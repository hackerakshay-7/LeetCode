class Solution {
    public int minimumPushes(String word) {
        // unique characters dekho
        // most freq dekho 
        int arr [] = new int[26];
        for(char c : word.toCharArray()){
            arr[c-'a']++;
        }
        Arrays.sort(arr);
        int ans =0;
        for(int i =0;i<26;i++){
            if(arr[25-i]==0) break;
            ans+=(arr[25-i]*((i/8)+1));
        }
 return ans;   }
}
/**
 int s =0,e=25;
        while(s<e){
            int temp = arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;e--;
        } */