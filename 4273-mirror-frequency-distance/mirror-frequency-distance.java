class Solution {
    public int mirrorFrequency(String s) {
        int ans =0;
      int bitmap [] = new int[36];
      for(char c : s.toCharArray()){
       if(c>=97 && c<=122){
            bitmap[c - 97]++;
           // bit2[Math.abs(c-97-25)]++;
       }
       else{
            bitmap[c-22]++;
           // bit2[Math.abs(c-22-9)]++;
       }
      }
      for(int i = 0 ; i<=('m'-97) ;i++){ // 13 times
        ans = ans + Math.abs(bitmap[i]-bitmap[25-i]);
      }
      for(int i =0;i<5;i++){
            ans = ans + Math.abs(bitmap[i+26]-bitmap[26+9-i]);
      }

    return ans;}
}